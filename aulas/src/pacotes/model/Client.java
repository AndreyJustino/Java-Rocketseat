package pacotes.model;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static List<Client> listClient = new ArrayList<>();

    private String name;
    private String email;
    private String password;

    public Client(String name, String email, String password){
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public Client(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
