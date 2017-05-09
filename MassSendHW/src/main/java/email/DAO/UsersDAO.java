package email.DAO;

import email.frameApp.UserAndPass;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import javax.persistence.Query;
import java.util.ArrayList;

import static email.hiber.HibernateUtil.getSessionFactory;

/**
 * Created by Дмитрий on 08.05.2017.
 */
public class UsersDAO extends AbstractDAO<UserAndPass> {
    public static SessionFactory sessionFactory=getSessionFactory();
    public UserAndPass mainUser=null;
    public static Session session=sessionFactory.openSession();
    public Transaction transaction=session.getTransaction();

    public void setMainUser(UserAndPass mainUser) {
        this.mainUser = mainUser;
    }

    public UsersDAO() {
    }

    @Override
    public void create(UserAndPass userAndPass) {
        transaction.begin();
        session.save(userAndPass);
        transaction.commit();

    }

    @Override
    public ArrayList<UserAndPass> read() {
        Query userQuery = session.createQuery("from UserAndPass ", UserAndPass.class);
       ArrayList<UserAndPass> arrayList = (ArrayList<UserAndPass>) userQuery.getResultList();
       return arrayList;
    }

    @Override
    public void update(UserAndPass userAndPass) {
        transaction.begin();
        session.update(userAndPass);
        transaction.commit();

    }

    @Override
    public void delete(UserAndPass userAndPass) {
        transaction.begin();
        session.delete(userAndPass);
        transaction.commit();
    }
}
