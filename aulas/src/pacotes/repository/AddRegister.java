package pacotes.repository;

import pacotes.model.Client;

public class AddRegister {


    public static String executeRegister(String name, String email, String password){

        Client usuario = new Client(name, email, password);

        Client.listClient.add(usuario);

        return usuario.toString();
    }

}
