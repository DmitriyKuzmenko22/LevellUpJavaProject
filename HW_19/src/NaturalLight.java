/**
 * Created by Дмитрий on 19.01.2017.
 */
abstract class NaturalLight implements SourceOfLight{
    boolean isDay;
    String sourceName;
    String action;


    public NaturalLight(boolean isDay, String sourceName, String action) {
        this.isDay = isDay;
        this.sourceName = sourceName;
        this.action = action;
    }

    @Override
    public void turnOn() {
        System.out.println("Настала ночь");
    }

    @Override
    public void show() {
        this.isDay = true;
        System.out.println("Настал день");
    }

    @Override
    public void getBright(int source) {
        System.out.println("Количество света " + source);
//
    }
}
