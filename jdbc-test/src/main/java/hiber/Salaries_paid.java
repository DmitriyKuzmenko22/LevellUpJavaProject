package hiber;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created by Дмитрий on 02.04.2017.
 */
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "Salaries_paid")
@ToString
public class Salaries_paid {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name ="salary")
    private float salary;
    @Column(name ="date_pay")
    private Date date_pay;
    @Column(name ="creationDate")
    private Date creationDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "employee_id", nullable = false)
    private Employee employees;


}
