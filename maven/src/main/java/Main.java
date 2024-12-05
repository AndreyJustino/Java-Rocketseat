import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/rocket_db";
        String user = "root";
        String password = "123456";

        try{
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("Conectado com sucesso.");

            String querySql = "INSERT INTO rocket_db.tbl_usuario (email, nome, idade) VALUES(?, ?, ?);";

            String email = "cloe@mail.com";
            String name = "Cloe";
            int age = 4;

            PreparedStatement pst = connection.prepareStatement(querySql);

            pst.setString(1, email);
            pst.setString(2, name);
            pst.setInt(3, age);

            pst.execute();
            System.out.println("Dados inseridos com sucesso");

            connection.close();
        }catch (SQLException e){
            System.out.println("Erro ao conectar com o banco: " + e.getMessage());
        }
    }
}
