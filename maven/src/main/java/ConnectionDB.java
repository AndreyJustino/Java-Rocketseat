import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {
    private static final String url = "jdbc:mysql://localhost:3306/rocket_db";
    private static final String user = "root";
    private static final String password = "123456";

    public static Connection connectionDB(){
        //criando conexão com o banco

        Connection connection = null;

        try{

            connection = DriverManager.getConnection(url, user, password);

        } catch (SQLException e) {
            System.out.println("Erro em conexão com o banco: " + e.getMessage());
        }

        return connection;
    }
}
