import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {
    public static Connection connectionDB(){
        //criando conexão com o banco
        String url = "jdbc:mysql://localhost:3306/rocket_db";
        String user = "root";
        String password = "123456";

        Connection connection = null;

        try{

            connection = DriverManager.getConnection(url, user, password);

            System.out.println("Conexão criada com sucesso!");

        } catch (SQLException e) {
            System.out.println("Erro em conexão com o banco: " + e.getMessage());
        }

        return connection;
    }
}
