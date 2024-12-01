package excecoes;

import java.text.NumberFormat;

public class Excecoes {
    public static void main(String[] args) {
        try {
            ativandoErro("Andrey");
        } catch (ErroPersonalizado e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        } catch (Exception e){
            System.out.println("Erro de exception");
        }
    }

    public static void ativandoErro(String name) throws ErroPersonalizado, Exception{
        if (name.equals("Andrey")){
            throw new ErroPersonalizado();
        }

        if (!name.equals("Cloe")){
            throw new Exception("Não coloco Cloe :(");
        }

        System.out.println("Ola Andrey");
    }
}
