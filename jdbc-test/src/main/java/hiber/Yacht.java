package hiber;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * Created by java on 07.04.2017.
 */
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Yacht extends Boat {

    @Column
    private double maxSpeed;
    @Column
    private  double lenght;

    public Yacht( String model, int maxPassengers, double maxSpeed, double lenght) {
        super(model, maxPassengers);
        this.maxSpeed = maxSpeed;
        this.lenght = lenght;
    }
}
