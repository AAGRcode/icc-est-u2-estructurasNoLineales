package eva;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class PersonaController {
    public Set<Persona> filtrarYOrdenar(List<Persona> personas, int edadUmbral){
        //personas mayores a 18 años
        Set<Persona> personasFiltradas = new TreeSet<>((p1, p2) -> {
            int compEdad = Integer.compare(p1.getEdad(), p2.getEdad());
            if(compEdad !=0){
                return compEdad;
            }

            int compNombre = p1.getNombre().compareToIgnoreCase(p2.getNombre());
            return compNombre;
        });

        for(Persona p : personas){
            if(p.getEdad() > edadUmbral){
                personasFiltradas.add(p);
            }
        }
        return personasFiltradas;
    }

    public Map<String, Set<String>> agruparPorEdad(List<Persona> personas){
        //personas agrupadas por edad
        String nombre = "Juan Perez";
        String[] palabras = nombre.split(" ");
        String primerNombre = palabras[0];
        //Arreglo de String - ["Juan", "Perez"]

        String pNombre = nombre.split(" ")[0];

        return null;
    }
    
}
