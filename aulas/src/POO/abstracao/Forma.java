package POO.abstracao;
//classe abstrata que não pode ser instaciada
//esta é uma classe modelo
abstract public class Forma {
    // metodo que vai obrigar a ser implemetado por subclasses
    public abstract double calcularArea();

    public void exibirTipo(){
        System.out.println("Isso é uma forma geometrica!");
    }
}
