package ua.dp.levelup.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.function.ObjLongConsumer;

/**
 * Created by java on 07.03.2017.
 */
public class XMLParser {

    public String toXML(Object obj) {
        StringBuilder builder = new StringBuilder();

        Class clazz = obj.getClass();
        builder.append(String.format("<%s>", clazz.getSimpleName()));

        builder.append("<book>\r\n\"");
        Field[] fields = clazz.getDeclaredFields();
        try {
            for (Field field : fields) {
                if (field.isAnnotationPresent(ToXML.class)) { //если ли аннотация у поля
                    String fieldName = field.getName();

                    if (!field.isAccessible()) field.setAccessible(true); //меняем доступ

                    builder.append(String.format("\t<%s>", fieldName));//подставит вместо нашей строки название нашей переменной
//\t - табуляция (перенос строки)
                    builder.append(field.get(obj));//получаем значение нашего филда(поля)

                    builder.append(String.format("</%s>", fieldName));
                    builder.append("\r\n");//добавляем перенос строки
                }
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }


        builder.append(String.format("</%s>", clazz.getSimpleName()));//simple name єто название класса
        return builder.toString();
    }

    public Object parseXML(String xml, Class clazz) {
        try {
            Object obj = clazz.newInstance(); //получить обїект єтого класса,новій инстанст обьект , ссілку нашего бука
            String[] lines = xml.split("\r\n");

            for (String line : lines) {
                //перебираем каждую строку из наших строк
                if (line.trim().equals(String.format("<%s>", clazz.getSimpleName()))
                        || line.trim().equals(String.format("</%s>", clazz.getSimpleName())))
                    continue;
                //если встречается открівающая или закрівающаяся строка то мі ее попускаем
                //<%s> симпл континие проверяем есть ли название нашего класса в ХМЛ

                int startIndex = line.indexOf("<") + 1;
                int endIndex = line.indexOf(">");
                String fieldName = line.substring(startIndex, endIndex);//получаем название филда, переменной нашей

                int startValueIndex = line.indexOf(">") + 1;
                int endValueIndex = line.indexOf("</");
                String fieldValue = line.substring(startIndex, endIndex).trim();

                Field field;
                try {
                    field = clazz.getDeclaredField(fieldName);//записіваем наше поле (ид) возвращает объект который содержит информацию о нашем поле (к примеру букнаме)

                } catch (NoSuchFieldException e){
                    e.printStackTrace();
                    continue;
                }


                Object value = getFieldValue(field, fieldValue);// значение

// continue - переходим к следующей итерации

                try {
                    Method methods = clazz.getDeclaredMethod(composeSetterName(fieldName));

                    methods.invoke(obj, value);//делает візов метода (newInstance) візівает сеттор нашего метода и передаем значение наше
                } catch (NoSuchMethodException e) {
                    if (field.isAccessible()) {
                        field.set(obj, value);
                    } else {
                        field.setAccessible(true);//меняем доступ с прайвет на паблик
                        field.set(obj, value);
                        field.setAccessible(false);
                    }
                } catch (InvocationTargetException e) {
                    e.printStackTrace();

                }
            }
            return obj;
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }

        return null;
    }

    private String composeSetterName(String fieldName) {
        return "set" + Character.toUpperCase(fieldName.charAt(0)) + fieldName.substring(1);
    }

    private Object getFieldValue(Field field, String fieldValue) {
        // <T> T такой же тип данніх которому мі кастим результат ответа
        Class type = field.getType();
        if (type == int.class || type == Integer.class) {
            return Integer.parseInt(fieldValue);
        } else if (type == long.class || type == Long.class) {
            return Long.parseLong(fieldValue);
        } else if (type == double.class || type == Double.class) {
            return Double.parseDouble(fieldValue);
        } else if (type == boolean.class || type == Boolean.class) {
            return Boolean.parseBoolean(fieldValue);
        }
        return fieldValue;
    }
}