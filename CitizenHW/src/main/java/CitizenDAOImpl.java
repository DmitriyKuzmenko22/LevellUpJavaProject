import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Дмитрий on 29.03.2017.
 */
public class CitizenDAOImpl<T extends Citizen> implements DAO<Citizen> {
    Connection connection;

    public CitizenDAOImpl(Connection connection) {
        this.connection = connection;
    }

    public void create(Citizen citizen) throws SQLException {
        PreparedStatement preparedStatement =
                connection.prepareStatement("INSERT INTO citizen (first_Name, last_Name, age) VALUES(?,?,?)",
                        Statement.RETURN_GENERATED_KEYS);

        preparedStatement.setString(1, citizen.getFirst_Name());
        preparedStatement.setString(2, citizen.getLast_Name());
        preparedStatement.setInt(3, citizen.getAge());

        preparedStatement.execute();
        ResultSet generatedKeys = preparedStatement.getGeneratedKeys();
        if (generatedKeys.next()) {
            citizen.setId(generatedKeys.getInt("GENERATED_KEY"));
            System.out.println(generatedKeys.getInt("GENERATED_KEY"));

        }

    }

    public void update(Citizen citizen) throws SQLException {
        PreparedStatement update =
                connection.prepareStatement("UPDATE citizen SET first_Name = ?, last_Name = ?, age=? WHERE ID = ?");

        update.setString(1, citizen.getFirst_Name());
        update.setString(2, citizen.getLast_Name());
        update.setLong(3, citizen.getAge());
        update.setLong(4, citizen.getId());

        update.execute();
    }

    public ArrayList<Citizen> read() throws SQLException {

        Statement statement = connection.createStatement();

        ResultSet resultSet = statement.executeQuery("SELECT * FROM Citizen");

        ArrayList<Citizen> userList = new ArrayList<Citizen>();
        while (resultSet.next()) {
            int id = resultSet.getInt(1);
            String username = resultSet.getString(2);
            String email = resultSet.getString(3);
            int pass = resultSet.getInt(4);

            userList.add(new Citizen(id, username, email, pass));

            System.out.println(resultSet.getInt("id")
                    + " " + resultSet.getString("first_Name")
                    + " " + resultSet.getString("last_Name")
                    + " " + resultSet.getInt("age"));
        }


        return userList;
    }

    public void delete(Citizen citizen) throws SQLException {
        PreparedStatement delete =
                connection.prepareStatement("delete from citizen WHERE ID = ?");
        delete.setLong(1, citizen.getId());
        delete.execute();

    }

    public Citizen readOneById(int id) throws SQLException {
        PreparedStatement prepareStatement= connection.prepareStatement("SELECT * FROM Citizen where id=?");
        prepareStatement.setInt(1,id);// argument, peremennaya
        ResultSet resultSet = prepareStatement.executeQuery();

        Citizen citizen=null;
        while (resultSet.next()) {
            String first_Name = resultSet.getString(2);
            String last_Name = resultSet.getString(3);
            int age = resultSet.getInt(4);

            citizen=new Citizen(id, first_Name, last_Name, age);

            System.out.println(resultSet.getInt("id")
                    + " " + resultSet.getString("first_Name")
                    + " " + resultSet.getString("last_Name")
                    + " " + resultSet.getInt("age"));
        }


        return citizen;
    }

    public Citizen readOneByEmail(String email) {
        return null;
    }
}
