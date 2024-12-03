package Interface;

public class CalculadoraBasica implements Calculadora{
    @Override
    public int somar(int n1, int n2) {
        return n1 + n2;
    }

    @Override
    public int subtrair(int n1, int n2) {
        return n1 - n2;
    }
}
