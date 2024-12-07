import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SelectAllUsers {
    private static List<User> userList = new ArrayList<>();

    public static List<User> listar (){
        String querySQL = "SELECT * FROM rocket_db.tbl_usuario";

        Connection connection = ConnectionDB.connectionDB();

        try{
            PreparedStatement pst = connection.prepareStatement(querySQL);

            ResultSet resultSet = pst.executeQuery();

            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String email = resultSet.getString("email");
                String name = resultSet.getString("nome");
                int age = resultSet.getInt("idade");

                userList.add(new User(id, email, name, age));
            }


        }catch (SQLException e){
            System.out.println("Erro ao listar usuarios: " + e.getMessage());
        }


        return userList;
    }

}
