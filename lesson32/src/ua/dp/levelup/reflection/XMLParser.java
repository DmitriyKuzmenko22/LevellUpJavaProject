package ua.dp.levelup.reflection;

import java.lang.reflect.Field;

/**
 * Created by java on 07.03.2017.
 */
public class XMLParser {

    public String toXML(Object obj) {
        StringBuilder builder = new StringBuilder();

        Class clazz=obj.getClass();
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

    public Object parseXML(String xml,Class clazz){
        try {
            Object obj = clazz.newInstance(); //получить обїект єтого класса,новій инстанст обьект , ссілку нашего бука
            String[] lines=xml.split("\r\n");

            for (String line: lines){
                //перебираем каждую строку из наших строк
                if (line.trim().equals(String.format("<%s>",clazz.getSimpleName()))||line.trim().equals(String.format("</%s>",clazz.getSimpleName()))) continue;
                //если встречается открівающая или закрівающаяся строка то мі ее попускаем

                int startIndex=line.indexOf("<")+1;
                int endIndex=line.indexOf(">");
                String fieldName= line.substring(startIndex,endIndex);//получаем название филда, переменной нашей
                Field field=clazz.getDeclaredField(fieldName);//записіваем

            }

        } catch (InstantiationException | NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }

        return null;

    }
}
