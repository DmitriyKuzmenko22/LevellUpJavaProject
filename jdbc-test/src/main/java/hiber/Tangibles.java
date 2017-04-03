package hiber;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Дмитрий on 02.04.2017.
 */
@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
@Table(name = "tangibles")
public class Tangibles {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "title")
    private String title;

    @Column(name = "price")
    private float price;

    @Column(name = "description")
    private String description;

    @Column(name = "date_create")
    private Date dateCreationl;
}
