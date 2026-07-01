package collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import models.Contacto;

public class Maps {
    // Map<k:V> k: key, V: value
    // Map<tipo de dato clave, tipo de dato valor>
    // Map<String, Integer> map = new HashMap<>();

    public Map<String, Integer> construirHashMap() {
        Map<String, Integer> mapa = new HashMap<>();
        mapa.put("A", 10);
        mapa.put("B", 20);
        mapa.put("C", 30);
        mapa.put("A", 50);

        System.out.println("Valor de la clave A: " + mapa.get("A"));
        System.out.println("Tamaño del mapa: " + mapa.size());
        System.out.println("Valores del mapa: " + mapa);

        for(int i = 0; i < mapa.size(); i++) {
            System.out.println(mapa.values().toArray()[i]);
        }

        for(String key : mapa.keySet()){
            System.out.println(key);
        }

        System.out.println(mapa.get("A"));
        System.out.println(mapa.get("B"));
        System.out.println(mapa.get("F"));

        mapa.putIfAbsent("F", 100);
        mapa.putIfAbsent("A", 200);
        System.out.println(mapa);
        return mapa;
    }

    public Map<String, Integer> construirLinkedHashMap(){
        Map<String, Integer> mapa = new LinkedHashMap<>();
        mapa.put("A", 10);
        mapa.put("B", 20);
        mapa.put("C", 30);
        mapa.put("A", 50);
        System.out.println(mapa);

        return mapa;
    }

    public Map<String, Integer> construirTreeMap(){
        Map<String, Integer> mapa = new TreeMap<>();
        mapa.put("J", 10);
        mapa.put("B", 20);
        mapa.put("C", 30);
        mapa.put("A", 50);
        System.out.println(mapa);

        return mapa;
    }

    public List<Contacto> ordenarUnicos(List<Contacto> contactos){
        Set<Contacto> nueva = new TreeSet<>((c1, c2) -> {
            if(c1.getNombre().equals(c2.getNombre())){
                return 0;
            }
            return c1.getApellido().compareTo(c2.getApellido());
        });
        for(Contacto c : contactos){
            nueva.add(c);
        }
        return nueva;
    }
}
