package pacotes.service;

import pacotes.model.Client;
import pacotes.repository.UpdateClient;

public class VerifyUpdate {
    public static String verifyUpdate(String name, String email, String password){

        if(name.isEmpty() || email.isEmpty() || password.isEmpty() ||
            name == null || email == null || password == null){
            throw new IllegalArgumentException("Preencha todos os campos!");
        }

        if (password.length() < 8){
            throw new IllegalArgumentException("Senha deve ter 8 ou mais caracteres");
        }

        String result = UpdateClient.updateClient(name, email, password);

        return result;
    }
}
