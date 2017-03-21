import java.sql.*;
import java.util.ArrayList;

/**
 * Created by Дмитрий on 20.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/forum?useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "qwerty");
            Statement statement = connection.createStatement();
            //ResultSet resultSet = statement.executeQuery("SELECT * FROM employees");
            ResultSet resultSet1=statement.executeQuery("SELECT * FROM employees");
            //ResultSet resultSet1 = statement.executeQuery("select * from citizen.tangibles where (title like \"%стол%\" and price < 1300) or (title not like \"%стол%\" and price >1000)");


            ArrayList<Employees> employees= new ArrayList<Employees>();
            while (resultSet1.next()) {
                int id=resultSet1.getInt(1);
                String name_first=resultSet1.getString(2);
                String name_last=resultSet1.getString(3);
                employees.add(new Employees(id,name_first,name_last));
                System.out.println(resultSet1.getLong(1) + " " + resultSet1.getString(2) + " " + resultSet1.getString(3));
            }
//            while (resultSet1.next()) {
//                System.out.println(resultSet1.getLong(1) + " " +
//                        resultSet1.getString(2) + " " +
//                        resultSet1.getLong(3)+ " " +
//                        resultSet1.getString(4)  + " "+ resultSet1.getDate(5));
//            }

            connection.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    }

