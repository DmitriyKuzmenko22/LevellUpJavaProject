/**
 * Created by Дмитрий on 15.01.2017.
 */
public abstract class CargoAirplane extends Plane {

    protected double luggageVolume;

    public CargoAirplane(int KreysSpeed, Type type, int passengerCapacity, int weight, int carryingCapacity, double luggageVolume) {
        super(KreysSpeed, type, passengerCapacity, weight, carryingCapacity);
        this.luggageVolume=luggageVolume;
    }
}
