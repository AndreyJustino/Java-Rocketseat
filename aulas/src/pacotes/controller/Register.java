package pacotes.controller;

import pacotes.service.VerifyRegister;

public class Register {
    public static String register(String name, String email, String password) {

        String result = VerifyRegister.verifyRegister(name, email, password);

        return result;
    }

}
