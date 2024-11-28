package pacotes.view;

import pacotes.controller.Register;
import pacotes.controller.Update;

import java.util.Scanner;

public class Screen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char answer = 'S';

        while (answer == 'S'){
            System.out.println("Sistema de cadastro:");

            System.out.print("Qual seu nome?: ");
            String name = sc.nextLine();

            System.out.print("Qual seu e-mail?: ");
            String email = sc.next();

            sc.nextLine();

            System.out.print("Qual sua senha?: ");
            String password = sc.nextLine();

            String result = Register.register(name, email, password);

            System.out.printf("Cadastro realizado com sucesso: %s%n",result);

            System.out.println("-----------------------------------------------");
            System.out.print("Deseja cadastrar mais alguem: [S/N]");
            answer = sc.next().toUpperCase().charAt(0);
            sc.nextLine();
            System.out.println("-----------------------------------------------");
        }


        /*
            Pode atualizar apenas o nome e a senha.
            E-mail não pode ser atualizado, ele é usado para encontrar
            a conta
        */

        System.out.println("Sistema de atualização de cadastro: ");

        System.out.print("Qual seu nome?: ");
        String name = sc.nextLine();

        System.out.print("Qual seu e-mail?: ");
        String email = sc.next();

        sc.nextLine();

        System.out.print("Qual sua senha?: ");
        String password = sc.nextLine();

        String result = Update.update(name, email, password);

        System.out.printf("Atualização realizada com sucesso: %s%n",result);

        sc.close();
    }
}
