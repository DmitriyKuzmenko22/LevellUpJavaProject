package email.frameApp;


import lombok.*;

import javax.persistence.*;

/**
 * Created by Дмитрий on 06.05.2017.
 */

@Entity
@Table(name = "rolename")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class UserAndPass {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "password")
    private String password;

    @Column(name = "roleAccount")
    private String roleAccount;

}
