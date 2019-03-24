import java.sql.*;

public class TestJDBC {

    private String url = "jdbc:mysql://localhost:3306/developers_db?serverTimezone=UTC";
    private String user = "root";
    private String password = "mrt89521";
    Connection connection;
    Statement statement;
    ResultSet resultSet;

    public static void main(String[] args) {
        TestJDBC test = new TestJDBC();
        test.start();
    }

    public void start() {
        try {
            connection = DriverManager.getConnection(url,user,password);
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM developers");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                int salary = resultSet.getInt(3);

                System.out.println(id + " " + name + " " + salary);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
