package ua.dp.levelup.reflection;

/**
 * Created by java on 07.03.2017.
 */
public class Book {

    @ToXML
    private final long id;
    @ToXML
    private String bookNmae;
    private int pageCount;
    public String author;

    public Book(long id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void Name(String str){

    }

    private void LastName(String str1){

    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public long getId() {
        return id;
    }


    public String getBookNmae() {
        return bookNmae;
    }

    public void setBookNmae(String bookNmae) {
        this.bookNmae = bookNmae;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }
}
