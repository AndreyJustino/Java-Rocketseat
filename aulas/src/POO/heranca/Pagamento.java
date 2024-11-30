package POO.heranca;

public class Pagamento {
    private Tipo tipo;

    public Pagamento(Tipo tipo){
        this.tipo = tipo;
    }

    public void pagamentoRealizado(double valor){
        System.out.printf("Pagamento de R$%.2f realizado com %s %n", valor, tipo);
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
}
