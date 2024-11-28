package pacotes.controller;

import pacotes.service.VerifyUpdate;

public class Update {
    public static String update(String name, String email, String password){

        String result = VerifyUpdate.verifyUpdate(name, email, password);

        return result;
    }
}
