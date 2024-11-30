package POO.polimorfismo;


/*
    polimorfismo duas classes tem o mesmo metodo
    mas que fazem coisas diferentes
*/

public class Polimorfismo {
    public static void main(String[] args){

        String pet = "cachorro";
        Animal som = null;

        if (pet == "gato"){
            som = new Gato();
        } else if (pet == "cachorro") {
            som = new Cachorro();
        }

        som.emitirSom();


    }

}
