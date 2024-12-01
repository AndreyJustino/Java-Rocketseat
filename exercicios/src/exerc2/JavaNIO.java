package exerc2;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class JavaNIO {
    public static void main(String[] args) {
        List<String> contatos = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        char answer = 'S';
        int cont = 1;

        while (answer == 'S'){

            System.out.printf("Informe o contado e nome da %d° pessoa:",cont);
            String dados = sc.nextLine();

            contatos.add(dados);

            System.out.print("Deseja cadastrar mais um contato?: [S/N]");

            answer = sc.next().toUpperCase().charAt(0);
            sc.nextLine();
            cont++;
        }

        Path arquivo = Paths.get("C:\\Temp\\Rock\\exercicios\\src\\exerc2\\contatos.txt");

        StringBuilder texto =  new StringBuilder();

        contatos.forEach(value -> texto.append(value + "\n"));

        try {
            Files.write(arquivo, texto.toString().getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        sc.close();
    }
}
