public class Main {
    public static void main(String[] args) {

        //InsertUser.insertUser(new User("admin", "admin@mail.com", 19));
        //UpdateUser.updateUser(new User("UsuarioAtualizado", "usuario@mail.com", 50));
        //DeleteUser.deleteUser(new User("UsuarioAtualizado", "usuario@mail.com", 50));
        SelectUser user = SelectUser.selectUser(new User("Adriana", "adriana@mail.com", 44));

        System.out.println(user);
    }
}
