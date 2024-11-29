package equals;

import pacotes.model.Client;

import java.util.Objects;

public class Equals {
    public static void main(String[] args) {
        int n1 = 129;
        Integer n2 = 129;

        System.out.println(n1 == n2);
        System.out.println(n2.equals(n1));

        String s1 = new String("Andrey");
        String s2 = new String("Andrey");

        Client user1 = new Client("Andrey", "andrey@mail.com", "senha123");
        Client user2 = new Client("Andrey", "andrey@mail.com", "senha123");

        System.out.println(s1.equals(s2));

        Integer x = 128;
        Integer y = 128;
        System.out.println(x.equals(y));

    }
}
