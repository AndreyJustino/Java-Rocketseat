import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectUser {

    private Integer id;
    private String name;
    private String email;
    private Integer age;

    public SelectUser(Integer id, String name, String email, Integer age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public static SelectUser selectUser(User user){
        String querySQL = "SELECT id, email, nome, idade FROM rocket_db.tbl_usuario WHERE email=?;";

        Connection connection = ConnectionDB.connectionDB();

        SelectUser selectUser = null;

        try{
            PreparedStatement pst = connection.prepareStatement(querySQL);
            
            pst.setString(1, user.getEmail());

            ResultSet resultSet = pst.executeQuery();

            if (resultSet.next()){

                int id = resultSet.getInt("id");
                String name = resultSet.getString("nome");
                String email = resultSet.getString("email");
                int age = resultSet.getInt("idade");

                selectUser = new SelectUser(id, name, email, age);
            }

        }catch (SQLException e){
            System.out.println("Erro ao selecionar usuario: " + e.getMessage());
        }

        if (selectUser == null){
            return null;
        }

        return selectUser;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "{" +
                "id:" + id +
                ", name:'" + name + '\'' +
                ", email:'" + email + '\'' +
                ", age:" + age +
                '}';
    }
}
