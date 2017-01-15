import java.util.Arrays;

/**
 * Created by Дмитрий on 15.01.2017.
 */
public class Main {
    public static void main(String[] args) {
        Plane[]planes={new Su37(3500,Type.OLD,2,1500,0,6),
        new AN124(750,Type.OLD,6,4500,78_000,0),
        new Airbus(790,Type.OLD,400,5000,0,0),};

        Airline airline=new Airline(planes);

        System.out.println("Total range of flight = "+ airline.calculateRangeFlight());
        System.out.println("Total max speed planes = " +airline.calculateMaxSpeed());
        System.out.println("Ищем по диапазону крейсерской скорости"+Arrays.toString(airline.getPlaneKreysSpeed(200,4000)));
        System.out.println("Общая вместимость = "+airline.calculateAirplaneMaxNumberOfPassenegers());
        System.out.println("Сортируем по весу = "+Arrays.toString(airline.sortByWeight()));


    }

}
