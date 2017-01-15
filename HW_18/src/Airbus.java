/**
 * Created by Дмитрий on 15.01.2017.
 */
public class Airbus extends CivilAircraft {


    public Airbus(int KreysSpeed, Type type, int passengerCapacity, int weight, int carryingCapacity,int amountPersonal) {
        super(KreysSpeed, type, passengerCapacity, weight, carryingCapacity,amountPersonal);
    }
    @Override
    public double getRangeFlight() {
        switch (getType()){
            case OLD:
                return 5_500;
            case NEW:
                return 6_500;
            case LUXNEW:
                return 8_000;
        }
        return -1;
    }

    @Override
    public int getMaxSpeed() {
        switch (getType()){
            case OLD:
                return 890;
            case NEW:
                return 910;
            case LUXNEW:
                return 950;
        }
        return -1;
    }


}
