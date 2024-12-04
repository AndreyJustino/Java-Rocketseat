package generico;

import java.util.ArrayList;
import java.util.List;

public class Generico {
    public static void main(String[] args) {
        List dados = new ArrayList(); //generico: não deixo explicito o tipo de dado que pode ser aceito

        dados.add("String");
        dados.add(123);
        dados.add(false);
        dados.add(12.3);
    }
}
