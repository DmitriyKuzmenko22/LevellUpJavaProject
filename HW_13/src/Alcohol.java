/**
 * Created by Дмитрий on 08.01.2017.
 */
public class Alcohol {
    private String name;
    private int amount;
    private double volume;
    private int cost;

    public Alcohol(String name, int amount, double volume, int cost) {
        this.name = name;
        this.amount = amount;
        this.volume = volume;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }

    public double getVolume() {
        return volume;
    }

    public int getCost() {
        return cost;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
