/**
 * Created by Дмитрий on 19.01.2017.
 */
public class HouseLamp extends Lampa {
    public HouseLamp(boolean isOn,int bright) {
        super(isOn, "HouseLamp", isOn?"Включен свет":"Выключен свет", bright);
        System.out.println(action);
    }
}
//
