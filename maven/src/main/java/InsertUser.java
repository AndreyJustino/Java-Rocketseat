import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertUser {
    //inserindo dados no banco
    public static void insertUser(String email, String name, int age){
        // criando query
        String querySQL = "INSERT INTO rocket_db.tbl_usuario (email, nome, idade) VALUES(?, ?, ?);";

        /* outra maneira de passar dados na query

            String email = "cloe@mail.com";
            String name = "Cloe";
            int age = 4;
        */

        // chamando conexão
        Connection connection = ConnectionDB.connectionDB();

        try {
            // preparando query
            PreparedStatement pst = connection.prepareStatement(querySQL);

            // dizendo em qual parametro vai ser inserido e o tipo de dados que vai ser inserido
            pst.setString(1, email);
            pst.setString(2, name);
            pst.setInt(3, age);

            // executando a query
            pst.execute();
            System.out.println("Dados inseridos com sucesso");

            //fechando a conexão
            connection.close();

        } catch (SQLException e) {
            System.out.println("Erro ao inserir usuario: " + e.getMessage());
        }

    }
}
