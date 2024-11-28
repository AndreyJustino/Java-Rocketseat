package pacotes.service;

import pacotes.repository.AddRegister;

public class VerifyRegister {
    public static String verifyRegister(String name, String email, String password){

        if (name.isEmpty() || email.isEmpty() || password.isEmpty() ||
                name == null || email == null || password == null){

            throw new IllegalArgumentException("Preencha todos os campos!");
        }

        if (password.length() < 8){
            throw new IllegalArgumentException("Senha deve ter 8 ou mais caracteres!");
        }

        String result = AddRegister.executeRegister(name, email, password);

        return result;
    }

}
