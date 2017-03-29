import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Created by Дмитрий on 29.03.2017.
 */
public interface DAO<T> {

    void create(T t) throws SQLException;

    ArrayList<T> read() throws SQLException;

    void update(T t) throws SQLException;

    void delete(T t) throws SQLException;

    T readOneById (int id) throws SQLException;

    T readOneByEmail  (String email);
}
