/**
 * Created by Дмитрий on 19.01.2017.
 */
public class Sun extends NaturalLight {
    public Sun(boolean isDay) {
        super(isDay, "Sun",isDay ? "is shining" : "is not shining");
        System.out.println(action);

    }

//
}
