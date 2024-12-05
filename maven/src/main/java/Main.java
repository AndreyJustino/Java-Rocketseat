import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        insertUser("usuario@mail.com", "Usuario", 24);
    }

    public static Connection connectionDB(){
        //criando conexão com o banco

        //credenciais
        String url = "jdbc:mysql://localhost:3306/rocket_db";
        String user = "root";
        String password = "123456";

        Connection connection = null;

        try{
            // criando conexão
            connection = DriverManager.getConnection(url, user, password);

            System.out.println("Conectado com sucesso.");

        }catch (SQLException e){
            System.out.println("Erro ao conectar no banco: " + e.getMessage());
        }

        return  connection;
    }

    public static void insertUser(String email, String name, int age){
        //inserindo usuario no banco
        try{
            // chamando conexão
            Connection connection = connectionDB();

            //contruindo query
            String querySql = "INSERT INTO rocket_db.tbl_usuario (email, nome, idade) VALUES(?, ?, ?);";

            //dados a ser passa no query
            /*String email = "cloe@mail.com";
            String name = "Cloe";
            int age = 4;*/

            // preparando query
            PreparedStatement pst = connection.prepareStatement(querySql);

            // dizendo em qual parametro vai ser inserido e o tipo de dados que vai ser inserido
            pst.setString(1, email);
            pst.setString(2, name);
            pst.setInt(3, age);

            // executando a query
            pst.execute();

            System.out.println("Dados inseridos com sucesso");

            //fechando a conexão
            connection.close();
        }catch (SQLException e){
            System.out.println("Erro ao conectar com o banco: " + e.getMessage());
        }
    }
}
