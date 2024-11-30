package POO.abstracao;

public class Retangulo extends Forma{

    private Double largura, altura;

    public Retangulo(double largura, double altura){
        this.largura = largura;
        this.altura = altura;
    }

    // metodo que a classe foi obrigada a implementar/ a dar continuidade
    @Override
    public double calcularArea() {

        return largura * altura;
    }
}
