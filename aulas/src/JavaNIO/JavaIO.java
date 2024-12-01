package JavaNIO;

import java.io.File; // Importa a classe File, usada para manipular arquivos e diretórios
import java.io.IOException; // Importa a classe IOException, usada para tratar erros de entrada/saída

public class JavaIO {
    public static void main(String[] args) {

        // Cria um objeto File que representa o diretório "diretorio"
        File diretorio = new File("C:\\Temp\\Rock\\aulas\\src\\JavaNIO\\diretorio");

        // Verifica se o diretório já existe, se o diretório não existir, cria um novo
        if (!diretorio.exists()) {

            diretorio.mkdir(); // Cria o diretório no caminho especificado
            System.out.println("Diretório criado.");
        }

        // Cria um objeto File que representa o arquivo "arquivo.txt" dentro do diretório
        // A segunda linha faz o mesmo que a primeira, mas de forma mais limpa e reutilizando o objeto `diretorio`

        /* File arquivo = new File("C:\\Temp\\Rock\\aulas\\src\\JavaNIO\\diretorio\\arquivo.txt"); */
        File arquivo = new File(diretorio, "arquivo.txt");

        try {

            // Tenta criar o arquivo no local especificado se ele ainda não existir
            arquivo.createNewFile();

        } catch (IOException e) {

            // Trata a exceção caso ocorra algum problema ao criar o arquivo
            throw new RuntimeException(e);
        }
    }
}

