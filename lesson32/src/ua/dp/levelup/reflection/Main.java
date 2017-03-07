package ua.dp.levelup.reflection;

import java.lang.reflect.Field;
import java.util.SimpleTimeZone;

/**
 * Created by java on 07.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        Book book=new Book(14);
       // book.setAuthor();
        book.setAuthor("Puskin");
        book.setBookNmae("Book1");
        book.setPageCount(32);

        Class aClass=book.getClass(); //получение єкземпляра класса

        Class bookClass = Book.class; //получение єкземпляра класса

        System.out.println("Book field:");
        Field[] fields=bookClass.getFields();//возвращает поля с публичнім доступом
      //  Method[] fields1=bookClass.getMethods();

        for (Field field: fields) System.out.println(field.getName());


        //  for (Method method:fields1) System.out.println(method.getName());

        System.out.println("Book declared fields:");
        Field[] declaredFields=bookClass.getDeclaredFields();//возвращает все поля
      //  Method[] fields22=bookClass.getDeclaredMethods();
        for (Field field: declaredFields) System.out.println(field.getName());
      //  for (Method method: fields22) System.out.println(method.getName());


        try {
            Field field=bookClass.getDeclaredField("author");//ссілка на поле в классе

            String author = (String) field.get(book);//что бі получить обьект из поля

            System.out.println(author);

            System.out.println("__________________________");
            field.set(book,"Gogol");
            String author1 = (String) field.get(book);
            System.out.println(author1);
            System.out.println("___________________________");

            Field field1=bookClass.getDeclaredField("id");// обращаемся к нашему ид
            field1.setAccessible(true);//меняем модификатор доступа
            field1.set(book,5);//зименяем его

            System.out.println(field1.get(book));



        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        XMLParser parser = new XMLParser();
        String bookAsXML= parser.toXML(book);
        System.out.println(bookAsXML);

        Author author= new Author("John","Doe",44);
        String authorToXML=parser.toXML(author);
        System.out.println(authorToXML);
    }
}
