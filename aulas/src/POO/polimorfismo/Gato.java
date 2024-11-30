package POO.polimorfismo;

public class Gato extends Animal{

    //alterando o metodo herdado da classe animal
    @Override
    public void emitirSom() {
        System.out.println("Gato fez 'Miau'! ");
    }

    public void somGenerico(){
        super.emitirSom();
    }
}
