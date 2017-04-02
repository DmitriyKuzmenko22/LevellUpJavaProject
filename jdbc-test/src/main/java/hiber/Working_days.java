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
@Entity
@Table(name = "working_days")
@ToString
public class Working_days {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "employee_id", nullable = false)
    private Employee employees;
    @Column(name = "day_start")
    private Date day_start=new Date();
    @Column(name = "day_finish")
    private Date day_finish=new Date();
    @Column(name = "date_create")
    private Date creationDate=new Date();

    public Working_days(Employee employees) {
        this.employees = employees;
    }
}
