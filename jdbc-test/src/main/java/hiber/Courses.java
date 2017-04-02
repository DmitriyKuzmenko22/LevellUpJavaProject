package hiber;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Дмитрий on 02.04.2017.
 */
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "courses")
public class Courses {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "title")
    private String title;
    @Column(name = "description")
    private String description;
    @Column(name ="price" )
    private float price;
    @Column(name ="hours" )
    private int hours;
    @Column(name = "date_create")
    private Date creationDate;

    public Courses(String title, float price, int hours) {
        this.title = title;
        this.price = price;
        this.hours = hours;
    }
}
