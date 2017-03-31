import java.sql.*;
import java.util.ArrayList;

/**
 * Created by Дмитрий on 29.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/citizen?useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "1234");
            Statement statement = connection.createStatement();

            Citizen citizen=new Citizen(4462,"Ivan","Ivanov",55);

            CitizenDAOImpl citizenDAO=new CitizenDAOImpl(connection);
           // citizenDAO.delete(citizen);
            citizenDAO.readOneById(4459);
            System.out.println();

            /*
            ResultSet resultSet1=statement.executeQuery("SELECT * FROM employees");

            while (resultSet1.next()) {
                System.out.println(resultSet1.getLong(1) + " " +
                        resultSet1.getString(2) + " " +
                        resultSet1.getString(3)+ " " +
                        resultSet1.getLong(5));
            }
*/
            connection.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    }

