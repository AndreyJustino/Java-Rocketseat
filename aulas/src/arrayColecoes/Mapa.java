package arrayColecoes;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Mapa {
    public static void main(String[] args) {
        //Map estados = new HashMap();

        //Map <String, String> estados = new HashMap();
        Map <String, String> estados = new TreeMap<>();

        estados.put("SP", "São Paulo");
        estados.put("RJ", "Rio de Janeiro");
        estados.put("AM", "Amazonia");
        estados.put("GO", "Goias");

        System.out.println(estados.get("SP"));

        Iterator ufsIterator = estados.keySet().iterator();

        while (ufsIterator.hasNext()){
            Object key = ufsIterator.next();

            Object value = estados.get(key);

            System.out.println(key + " " + value);
        }

    }
}
