package mapas;

import java.util.HashMap;
import java.util.Map;

public class Mapas {

    public static void main(String[] args) {
        Map<String, Dados> map = new HashMap<String, Dados>();
        map.put("Aqui",new Dados(1,"Aqui"));
        map.put("Aqui1",new Dados(12,"Aqui1"));
        System.out.println("Map: ");
        System.out.println(map);
    
    for (String chave : map.keySet()){
        Dados d = map.get(chave);
        System.out.println(chave);
    }
        
    }
    
}
