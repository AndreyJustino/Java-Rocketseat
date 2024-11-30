package POO.polimorfismo;

public class Cachorro extends Animal{

    //alterando o metodo herdado da classe animal
    @Override
    public void emitirSom() {
        System.out.println("Cachorro Latiu!");
    }

    public void somGenerico(){
        super.emitirSom();
    }
}
