/**
 * Created by Дмитрий on 19.01.2017.
 */
public class Lampa extends deadLight{

    public Lampa(boolean isOn, String sourceName, String action, int bright) {
        super(isOn, sourceName, action, bright);
    }

    public void getQuantity(){
        System.out.println("Количество света "+ bright +" ватт");
    }
}
//
