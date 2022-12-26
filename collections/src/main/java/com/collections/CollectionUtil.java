package main.java.com.collections;

import java.util.List;
import java.util.Map;

public class CollectionUtil {

    /**
     * Modifica la lista orignial de personas eliminando las personas que
     * tengan un nombre con un espacio en blanco
     */
    public void eliminaNombresConEspacios(List<Persona> original) {
        original.removeIf(it -> it.getNombre().indexOf(' ') != -1);
    }

    /**
     * Modifica la lista con pasando todos los nombres a mayúscula (nombre, primer y
     * segundo apellido)
     * Id con cuidado con el segundo apellido, que es optional!
     */
    public void pasarAMayusculas(List<Persona> original) {
        original.replaceAll(p -> new Persona(p.getNombre().toUpperCase(),
                p.getApellido1().toUpperCase(),
                p.getApellido2().map(it -> it.toUpperCase())));
    }

    /**
     * Devuelve una cadena con el contenido del map
     * si map es
     * [ "prod1", 4
     * "prod2", 5 ]
     * El metodo debe devolver "prod1:4,prod2:5,"
     */
    public String aTexto(Map<String, Integer> factura) {
        StringBuilder result = new StringBuilder();
        factura.forEach((k, v) -> result.append(k + ":" + v + ","));
        return result.toString();
    }
}
