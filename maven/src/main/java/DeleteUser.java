import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteUser {
    public static void deleteUser(User user){

        SelectUser result = SelectUser.selectUser(user);

        if (result == null){

            System.out.println("Usuario não encontrado.");
            return;
        }

        String querySQL = "DELETE FROM rocket_db.tbl_usuario WHERE email=?;";

        Connection connection = ConnectionDB.connectionDB();

        try{
            PreparedStatement pst = connection.prepareStatement(querySQL);

            pst.setString(1, user.getEmail());

            pst.executeUpdate();

            System.out.println("Conta excluida com sucesso.");

            connection.close();

        }catch (SQLException e){
            System.out.println("Erro ao deletar usuario: " + e.getMessage());
        }

    }
}
