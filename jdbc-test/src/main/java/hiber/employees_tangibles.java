package hiber;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Дмитрий on 03.04.2017.
 */
@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
@Table(name="employees_tangibles")
public class employees_tangibles {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "employee_id", nullable = false)
    private Employee employees;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tangible_id")
    private Tangibles tangibles;

    @Column(name = "uniq_number")
    private int uniq_number;

    @Column(name = "date_create")
    private Date creationDate;


}
