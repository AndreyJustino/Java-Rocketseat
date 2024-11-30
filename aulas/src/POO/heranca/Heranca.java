package POO.heranca;

public class Heranca {
    public static void main(String[] args) {
        Pagamento pix = new PagamentoPix(20.22F, Tipo.PIX);
        Pagamento credito = new PagamentoCredito(34.50F, Tipo.CREDITO);
        Pagamento pagamento = new Pagamento(Tipo.DEBITO);

        /*
            usando metodo herdado classe pagamento
        */

        pix.pagamentoRealizado(15);
        credito.pagamentoRealizado(24.50);
        pagamento.pagamentoRealizado(42.99);

        /*  nesses dois esta sendo feito um casting
            estou passando a referencia que tem o tipo
            Pagamento para o tipo que tem o metodo get...()
            e então chamando o metodo get...()

         */
        float pixValor = ((PagamentoPix) pix).getValor();
        float creditoValor = ((PagamentoCredito) credito).getValor();


        Tipo pagamentoValor = pagamento.getTipo();

        System.out.println(pixValor);
        System.out.println(creditoValor);
        System.out.println(pagamentoValor);


    }
}
