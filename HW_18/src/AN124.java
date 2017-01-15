/**
 * Created by Дмитрий on 15.01.2017.
 */
public class AN124 extends CargoAirplane {

    public AN124(int KreysSpeed, Type type, int passengerCapacity, int weight, int aircraftHeight,double luggageVolume) {
        super(KreysSpeed, type, passengerCapacity, weight, aircraftHeight,luggageVolume);
    }

    @Override
    public double getRangeFlight() {
        switch (getType()){
            case OLD:
                return 7_500;
            case NEW:
                return 8_000;
            case LUXNEW:
                return 8_500;
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
                return 930;
        }return -1;
    }
}
