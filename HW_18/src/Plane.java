
/**
 * Created by Дмитрий on 15.01.2017.
 */
public abstract class Plane {

    private int kreysSpeed;
    private Type type;
    private int passengerCapacity;
    private int weight;
    private int carryingCapacity;

    public Plane(int kreysSpeed, Type type, int passengerCapacity, int weight, int carryingCapacity) {
        this.kreysSpeed=kreysSpeed;
        this.type = type;
        this.passengerCapacity = passengerCapacity;
        this.weight = weight;
        this.carryingCapacity = carryingCapacity;
    }

    public abstract double getRangeFlight();


    public abstract int getMaxSpeed();

    public int getKreysSpeed() {
        return kreysSpeed;
    }

    public void setKreysSpeed(int kreysSpeed) {
        this.kreysSpeed = kreysSpeed;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getCarryingCapacity() {
        return carryingCapacity;
    }

    public void setCarryingCapacity(int carryingCapacity) {
        this.carryingCapacity = carryingCapacity;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "KreysSpeed=" + kreysSpeed +
                ", type=" + type +
                ", passengerCapacity=" + passengerCapacity +
                ", weight=" + weight +
                ", carryingCapacity=" + carryingCapacity +
                '}';
    }
}
