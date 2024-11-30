package time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Data {
    public static void main(String[] args) {
        localDate();
    }

    public static void localDate(){
        LocalDate hoje = LocalDate.now(); // pegar data atual

        /*------------------------------------------------------------------------------*/

        LocalDate aniversario = LocalDate.of(2005, 5, 7);

        aniversario.plusYears(5); // adicionar mais 5 anos em alguma data

        /*------------------------------------------------------------------------------*/

        String data = "2024-03-16";

        LocalDate dataConcreta = LocalDate.parse(data); //passar data do tipo string pro tipo LocalDate

        /*------------------------------------------------------------------------------*/

        //formato brasileiro

        String dataFormatoBR = "25/12/2024";

        /*formatando o tipo de data recebida para um formato aceito*/
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate formatada = LocalDate.parse(dataFormatoBR, formatter);

        //System.out.println(formatada);


        /*------------------------------------------------------------------------------*/

        LocalDate data1 = LocalDate.of(2012, 4, 7);
        LocalDate data2 = LocalDate.of(2013, 5, 8);

        /*
        System.out.println(data1.isBefore(data2)); //true
        System.out.println(data1.isAfter(data2)); //false
        System.out.println(data1.isEqual(data2)); //false
         */

        /*------------------------------------------------------------------------------*/

        LocalDate dataArmazenada = LocalDate.of(2019, 12, 21);

        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        //System.out.println(formatter1.format(dataArmazenada));

        int dayOfMonth = dataArmazenada.getDayOfMonth();

    }
}
