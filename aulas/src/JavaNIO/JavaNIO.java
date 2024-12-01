package JavaNIO;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

//deu uma olhada no arquivo

public class JavaNIO {
    public static void main(String[] args) {
        Path arquivo = Paths.get("C:\\Temp\\Rock\\aulas\\src\\JavaNIO\\diretorio\\arquivo.txt");

        try {
            List<String> texto = Files.readAllLines(arquivo);

            for (String value : texto){
                System.out.println(value);
            }

            String conteudo = "Texto que vou esquever no arquivo";

            Files.write(arquivo,conteudo.getBytes(StandardCharsets.UTF_8));

            List<String> names = new ArrayList<>();
            names.add("Andrey");
            names.add("Adriana");
            names.add("Cloe");

            StringBuilder dados = new StringBuilder();

            names.forEach(value -> dados.append(value + "\n"));

            Files.write(arquivo, dados.toString().getBytes(StandardCharsets.UTF_8));


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
