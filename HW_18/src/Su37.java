/**
 * Created by Дмитрий on 15.01.2017.
 */
public class Su37 extends WarPlane {
    public Su37(int KreysSpeed, Type type, int passengerCapacity, int weight, int carryingCapacity,int numberWeapons) {
        super(KreysSpeed, type, passengerCapacity, weight, carryingCapacity,numberWeapons);
    }

    @Override
    public double getRangeFlight() {
        switch (getType()){
            case OLD:
                return 3_700;
            case NEW:
            return 4_000;
            case LUXNEW:
                return 4_500;

        }
        return -1;
    }

    @Override
    public int getMaxSpeed() {
        switch (getType()){
            case OLD:
                return 2500;
            case NEW:
                return 2700;
            case LUXNEW:
                return 3000;
        }
        return -1;
    }
}
