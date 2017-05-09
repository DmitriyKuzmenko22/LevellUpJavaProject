package email.DAO;

import email.frameApp.UserAndPass;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import static email.hiber.HibernateUtil.getSessionFactory;

import java.util.ArrayList;

/**
 * Created by Дмитрий on 06.05.2017.
 */
public class UsersDAO extends AbstractDAO<UserAndPass> {

    SessionFactory sessionFactory=getSessionFactory();
    public UserAndPass mainUser=null;
    public Session session=sessionFactory.openSession();

    public void setMainUser(UserAndPass mainUser) {
        this.mainUser = mainUser;
    }


    public UsersDAO() {
    }

    @Override
    public void create(UserAndPass userAndPass) {

    }

    @Override
    public ArrayList<UserAndPass> read() {
        return null;
    }

    @Override
    public void update(UserAndPass userAndPass) {

    }

    @Override
    public void delete(UserAndPass userAndPass) {

    }
}