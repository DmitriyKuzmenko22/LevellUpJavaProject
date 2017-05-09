package email.hiber;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Created by Дмитрий on 06.05.2017.
 */
    public class HibernateUtil {
        private static SessionFactory sessionFactory = null;

        static {
            try {
//creates the session factory from hibernate.cfg.xml
                sessionFactory = new Configuration().configure().buildSessionFactory();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public static SessionFactory getSessionFactory() {
            return sessionFactory;
        }
    }

