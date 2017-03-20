import java.sql.*;

/**
 * Created by Дмитрий on 20.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/citizen?useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "1234");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM citizen.citizen");
            ResultSet resultSet1 = statement.executeQuery("select * from citizen.tangibles where (title like \"%стол%\" and price < 1300) or (title not like \"%стол%\" and price >1000)");

//            while (resultSet.next()) {
//                System.out.println(resultSet.getLong("ID") + " " + resultSet.getString("first_Name") + " " + resultSet.getString("last_Name"));
//            }
            while (resultSet1.next()) {
                System.out.println(resultSet1.getLong(1) + " " +
                        resultSet1.getString(2) + " " +
                        resultSet1.getLong(3)+ " " +
                        resultSet1.getString(4)  + " "+ resultSet1.getDate(5));
            }

            connection.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    }

