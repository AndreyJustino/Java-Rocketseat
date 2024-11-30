package POO.encapsulamento;

import java.time.LocalDate;

public class Encapsulamento {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Andrey", 19, LocalDate.of(2005, 5, 7));

        System.out.println(usuario.toString());

        /*
         Não funcionaria esse tipo de atribuição pois o atributos são privados (encapsulamento)
         usuario.name = "Athena";
         usuario.age = 200;
         usuario.birth = LocalDate.of(1824, 11, 30);
         */

        // forma que funcionario usando getter and setter
        usuario.setName("Athena");
        usuario.setIdade(200);
        usuario.setNascimento(LocalDate.of(1824, 11, 30));

        System.out.println(usuario.getName());
        System.out.println(usuario.getIdade());
        System.out.println(usuario.getNascimento());

    }
}