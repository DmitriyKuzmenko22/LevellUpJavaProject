package hiber;

import lombok.*;

<<<<<<< HEAD
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
=======
import javax.persistence.*;
>>>>>>> 95e4c5e1ca9fb9012f9b0e7ca09fbbaed6aadd16

/**
 * Created by java on 07.04.2017.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Embeddable
public class Car {

    @Column
    private String model;
<<<<<<< HEAD
=======

>>>>>>> 95e4c5e1ca9fb9012f9b0e7ca09fbbaed6aadd16
    @Enumerated(EnumType.STRING)
    @Column
    private Color color= Color.BLACK;

    @Column
    private  double maxSpeed;

    public Car(double maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }
}
