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
@Entity
@Table(name = "employees_courses")
@ToString
public class employees_courses {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "employee_id", nullable = false)
    private Employee employees;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "course_id",nullable = false)
        private Courses courses;

    @Column(name = "date_start")
    private Date day_start;
    @Column(name = "date_finish")
    private Date day_finish;

    @Column(name = "is_organization_paid")
    private boolean organization;

    @Column(name = "date_create")
    private Date dateCreation=new Date();

}
