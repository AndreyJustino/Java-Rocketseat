package generico;

public class MetodoGenerico {
    // Método genérico
    public static <T> void imprimirArray(T[] array) {
        for (T elemento : array) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }

    // Método genérico com retorno
    public static <T> T retornarPrimeiroElemento(T[] array) {
        if (array.length > 0) {
            return array[0];
        }
        return null; // ou lance uma exceção
    }

    public static void main(String[] args) {
        // Exemplo com Integer
        Integer[] numeros = {1, 2, 3, 4, 5};
        imprimirArray(numeros);

        // Exemplo com String
        String[] palavras = {"Olá", "Mundo"};
        imprimirArray(palavras);

        // Teste do retorno genérico
        Integer primeiroNumero = retornarPrimeiroElemento(numeros);
        System.out.println("Primeiro número: " + primeiroNumero);

        String primeiraPalavra = retornarPrimeiroElemento(palavras);
        System.out.println("Primeira palavra: " + primeiraPalavra);
    }
}
