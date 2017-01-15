import java.util.*;

/**
 * Created by Дмитрий on 15.01.2017.
 */
public class Airline {

    private Plane[] plane;

    public Airline(Plane[] plane) {
        this.plane = plane;
    }

    public double calculateRangeFlight() {
        double totalRangeFlight = 0;
        for (Plane p :
                plane) {
            totalRangeFlight += p.getRangeFlight();
        }
        return totalRangeFlight;
    }

    public int calculateMaxSpeed() {
        int totalaxSpeed = 0;
        for (Plane p :
                plane) {
            totalaxSpeed += p.getMaxSpeed();
        }
        return totalaxSpeed;
    }

    public Plane[] getPlaneKreysSpeed(int from, int to) {
        List<Plane> planeList = new ArrayList<>();
        for (Plane p :plane) {
            if (p.getKreysSpeed() <= to && p.getKreysSpeed() >= from) {
                planeList.add(p);
            }
        }
        return planeList.toArray(new Plane[1]);
    }

    public int calculateAirplaneMaxNumberOfPassenegers(){
        int totalNumOfPassengers = 0;

        for (Plane p:plane) {
            totalNumOfPassengers += p.getPassengerCapacity();
        }
        return totalNumOfPassengers;
    }
    public Plane[] sortByWeight() {
        Plane[] res = new Plane[plane.length];
        System.arraycopy(plane,0,res,0,plane.length);//  копируем массив, копируем в него
        Arrays.sort(plane, getComparator());
        return res;
    }

    private Comparator<Plane> getComparator() {
        return (c1, c2) -> Double.compare(c1.getWeight(), c2.getWeight());
    }


}
