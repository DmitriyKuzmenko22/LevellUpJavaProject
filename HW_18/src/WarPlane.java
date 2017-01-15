/**
 * Created by Дмитрий on 15.01.2017.
 */
public abstract class WarPlane extends Plane {

    protected int numberWeapons;

    public WarPlane(int KreysSpeed, Type type, int passengerCapacity, int weight, int carryingCapacity,int numberWeapons) {
        super(KreysSpeed, type, passengerCapacity, weight, carryingCapacity);
        this.numberWeapons=numberWeapons;
    }
}
