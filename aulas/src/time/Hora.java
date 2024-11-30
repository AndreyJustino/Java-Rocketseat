package time;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Hora {
    public static void main(String[] args) {
        localTime();
    }

    public static void localTime(){

        LocalTime hora = LocalTime.now();
        LocalTime horaFicticia = LocalTime.of(22,15,39);

        DateTimeFormatter horaFormatada = DateTimeFormatter.ofPattern("HH:mm:ss:nn");

        System.out.println(hora.format(horaFormatada));

        LocalTime localTime = hora.plusHours(3);

        boolean after = hora.isAfter(horaFicticia);

        System.out.println(after);
    }
}
