package POO.heranca;

public class PagamentoPix extends Pagamento{
    private Float valor;

    /*
        usando os atributos que foram herdados da classe
        pagamento
     */

    public PagamentoPix(float valor, Tipo tipo) {
        super(tipo);
        this.valor = valor;
    }

    public Float getValor() {
        return valor;
    }
}
