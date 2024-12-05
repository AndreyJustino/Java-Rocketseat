import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/rocket_db";
        String user = "root";
        String password = "123456";

        try{
            Connection connection = DriverManager.getConnection(url, user, password);

            System.out.println(connection);

            System.out.println("Conectado com sucesso.");
            connection.close();
        }catch (SQLException e){
            System.out.println("Erro ao conectar com o banco: " + e.getMessage());
        }
    }
}
