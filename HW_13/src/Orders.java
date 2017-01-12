/**
 * Created by Дмитрий on 08.01.2017.
 */
public class Orders {
    String title;
    int amount;


    public Orders(String title, int amount) {
        this.title = title;
        this.amount = amount;
    }

    public String getTitle() {
        return title;
    }

    public int getAmount() {
        return amount;
    }


    public void setTitle(String title) {
        this.title = title;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }


}
