package POO.heranca;

public class PagamentoCredito extends Pagamento{

    private Float valor;

    /*
        usando os atributos que foram herdados da classe
        pagamento
     */

    public PagamentoCredito(float valor, Tipo tipo) {
        super(tipo);
        this.valor = valor;
    }

    public Float getValor() {
        return valor;
    }
}
