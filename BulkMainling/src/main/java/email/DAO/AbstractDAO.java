package email.DAO;

import org.hibernate.SessionFactory;

import java.util.ArrayList;

/**
 * Created by Дмитрий on 06.05.2017.
 */
public abstract class AbstractDAO<T>{

    public abstract void create(T t);

    public abstract ArrayList<T> read();

    public abstract void update(T t);

    public abstract void delete(T t);

}
