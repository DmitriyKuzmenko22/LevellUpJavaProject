package hiber;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
@Table(name = "posts")
public class Posts {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "title")
    private String title;
    @Column(name = "date_create")
    private Date creationDate;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "post")
    private List<Employee> employees;

    public Posts(String title, Date creationDate) {
        this.title = title;
        this.creationDate = creationDate;
    }

    @Override
    public String toString() {
        return "Posts{" +
                "id=" + id +
                ", title='" + title + '\'' +
                '}';
    }
}
