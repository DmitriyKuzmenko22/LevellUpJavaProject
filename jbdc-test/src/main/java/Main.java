/**
 * Created by java on 17.03.2017.
 */



import java.sql.*;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/citizen?useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "qwerty");

        Statement statement=connection.createStatement();//хранит запрос и возвращает ответ
        ResultSet resultSet=statement.executeQuery("SELECT * FROM FORUM.USERS");//делаем запрос и возвращаем результат ответа (результат сн)

        while (resultSet.next()){
            System.out.println(resultSet.getLong("ID")+ " "+ resultSet.getString("userName")+" "+ resultSet.getString("Email"));
        }
        connection.close();

    }
}
