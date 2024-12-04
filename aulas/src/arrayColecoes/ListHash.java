package arrayColecoes;

import java.util.Set;
import java.util.TreeSet;

public class ListHash {
    public static void main(String[] args) {
        //Set linguagens = new HashSet();
        //Set linguagens = new LinkedHashSet();
        Set linguagens = new TreeSet();

        linguagens.add("Java");
        linguagens.add("CSharp");
        linguagens.add("JavaScript");
        linguagens.add("Java");
        linguagens.add("Python");
        linguagens.add("Go");

        for (Object value : linguagens){
            System.out.println(value);
        }

    }
}

