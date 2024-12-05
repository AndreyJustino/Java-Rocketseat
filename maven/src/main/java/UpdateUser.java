import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateUser {
    public static void updateUser(User user){
        String querySQL = "UPDATE rocket_db.tbl_usuario SET nome=?, idade=? WHERE email=? ;";

        Connection connection = ConnectionDB.connectionDB();

        try {
            PreparedStatement pst = connection.prepareStatement(querySQL);

            pst.setString(1, user.getName());
            pst.setInt(2, user.getAge());
            pst.setString(3, user.getEmail());

            pst.executeUpdate();

            System.out.println("Dados atualizados");

            connection.close();

        } catch (SQLException e) {
            System.out.println("Error em atualizar usuario: " + e.getMessage());
        }
    }
}
