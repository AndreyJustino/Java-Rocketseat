package Interface;

public class Main {
    public static void main(String[] args) {
        CalculadoraBasica calculadoraBasica = new CalculadoraBasica();

        int soma = calculadoraBasica.somar(2,4);
        int subtrair = calculadoraBasica.subtrair(8,3);

        System.out.println("Soma: " + soma);
        System.out.println("Subtrair: " + subtrair);
    }
}
