/*Создать объект класса Фотоальбом, используя классы Фотография, Страница.
Методы: задать название фотографии, дополнить фотоальбом фотографией,
вывести на консоль количество фотографий.
*/
public class Photo {
    String title;
    String url;

    Photo(String title) {
        this.title = title;

    }

    Photo(String title, String url) {
        this.title = title;
        this.url = url;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}