/**
 * Created by Дмитрий on 15.01.2017.
 */
public abstract class CivilAircraft extends Plane {

    protected int amountPersonal;

    public CivilAircraft(int KreysSpeed, Type type, int passengerCapacity, int weight, int carryingCapacity,int amountPersonal) {
        super(KreysSpeed, type, passengerCapacity, weight, carryingCapacity);
        this.amountPersonal=amountPersonal;
    }


}
