/**
 * Created by java on 09.12.2016.
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
