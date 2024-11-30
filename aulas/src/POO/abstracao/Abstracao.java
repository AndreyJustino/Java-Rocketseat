package POO.abstracao;

public class Abstracao {
    public static void main(String[] args){
        /*
        A classe abstrata não pode ser instaciada pois ela é abstrata
        logo tenho que instaciar a classe que estende  classe abstrata
         */

        Retangulo retangulo = new Retangulo(10.2, 21.6);

        System.out.println(retangulo.calcularArea());
    }
}
