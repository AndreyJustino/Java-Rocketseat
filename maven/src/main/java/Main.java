import java.util.List;

public class Main {
    public static void main(String[] args) {

        //InsertUser.insertUser(new User("usuario", "usuario@mail.com", 29));
        //UpdateUser.updateUser(new User("UsuarioAtualizado", "usuario@mail.com", 50));
        //DeleteUser.deleteUser(new User("UsuarioAtualizado", "usuario@mail.com", 50));
        //SelectUser user = SelectUser.selectUser(new User("Adriana", "adriana@mail.com", 44));

        List<User> list = SelectAllUsers.listar();

        for(User value : list){
            System.out.println(value);

        }

    }
}
