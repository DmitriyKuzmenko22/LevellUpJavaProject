package web.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

/**
 * Created by Дмитрий on 19.05.2017.
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity
@Table(name="webbsite")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "login")
    private String login;

    @Column(name = "name")
    private String name;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "phone")
    private String phone;

    @Column(name = "email")
    private String email;

    @Column(name = "verif_key")
    private String verif_key;

    @Column(name = "access_key")
    private boolean access_key;

    public User(String login, String name, String lastName, String phone, String email, String verif_key ) {
        this.login = login;
        this.name = name;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
        this.access_key=false;
        this.verif_key=verif_key;
    }

    public String getVerif_key() {
        return verif_key;
    }

    public void setVerif_key(String verif_key) {
        this.verif_key = verif_key;
    }

    public boolean isAccess_key() {
        return access_key;
    }

    public void setAccess_key(boolean access_key) {
        this.access_key = access_key;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
