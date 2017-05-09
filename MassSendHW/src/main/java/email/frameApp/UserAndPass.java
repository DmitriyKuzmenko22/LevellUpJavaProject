package email.frameApp;

import lombok.*;

import javax.persistence.*;

/**
 * Created by Дмитрий on 08.05.2017.
 */

@Entity
@Table(name = "rolename")
@Getter
@Setter
@NoArgsConstructor
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

    public UserAndPass(String name, String password, String roleAccount) {
        this.name = name;
        this.password = password;
        this.roleAccount = roleAccount;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRoleAccount() {
        return roleAccount;
    }

    public void setRoleAccount(String roleAccount) {
        this.roleAccount = roleAccount;
    }
}
