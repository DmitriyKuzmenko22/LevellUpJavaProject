package dto;

import java.io.Serializable;

/**
 * Created by java on 16.05.2017.
 */
public class TargetData implements Serializable {

    private String email;
    private String userName;

    public TargetData(String email, String userName) {
        this.email = email;
        this.userName = userName;
    }

    public TargetData() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "TargetData{" +
                "email='" + email + '\'' +
                ", userName='" + userName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TargetData that = (TargetData) o;

        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        return userName != null ? userName.equals(that.userName) : that.userName == null;
    }

    @Override
    public int hashCode() {
        int result = email != null ? email.hashCode() : 0;
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        return result;
    }
}
