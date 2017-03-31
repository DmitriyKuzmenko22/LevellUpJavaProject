package hiber;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created by java on 31.03.2017.
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column
    private String title;
    @Column(name = "date_create")
    private Date creationDate;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "department") //один департмент много ємплоии,связ с колонкой департмент
    private List<Employee> employees;

    public Department(String title, Date creationDate) {
        this.title = title;
        this.creationDate = creationDate;
    }
}
