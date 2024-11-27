package exerc1;

import banco.entities.Conta;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta(321,
                2000,
                LocalDate.of(2024, 12, 20),
                "Andrey",
                0705);

        conta.sacar(200);

        System.out.printf("%.2f%n", conta.getBalance());

        System.out.println(conta.toString());


    }
}
