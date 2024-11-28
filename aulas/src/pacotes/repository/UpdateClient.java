package pacotes.repository;

import pacotes.model.Client;

import java.util.Objects;

public class UpdateClient {

    public static String updateClient(String name, String email, String password){

        Client result = Client.listClient.stream()
                .filter(value -> value.getEmail().equals(email))
                .findFirst()
                .orElse(null);

        if (result == null){
            throw new RuntimeException("Usuario não encontrado!");
        }

        int count = 0;
        int index = 0;

        for (Client value : Client.listClient){
            if (Objects.equals(value.getEmail(), email)){
                index = count;

                break;
            }
            count++;
        }

        Client.listClient.get(index).setName(name);
        Client.listClient.get(index).setPassword(password);


        return result.toString();
    }
}
