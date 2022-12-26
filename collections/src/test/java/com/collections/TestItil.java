package test.java.com.collections;

import static org.junit.Assert.*;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.junit.Before;
import org.junit.Test;

public class TestUtil {

    private List<Persona> lista;
    private CollectionUtil util;

    @Before
    public void init() {
        lista = new LinkedList<>();
        lista.add(new Persona("Juan de", "Alicia", Optional.of("Martin")));
        lista.add(new Persona("Victoria", "Mel", Optional.empty()));
        util = new CollectionUtil();

    }

    @Test
    public void test_list() {

        util.eliminaNombresConEspacios(lista);
        assertEquals(1, lista.size());
        assertEquals("Victoria", lista.get(0).getNombre());
    }

    @Test
    public void test_a_mayuscula() {

        util.pasarAMayusculas(lista);
        assertEquals(2, lista.size());
        assertEquals("JUAN DE", lista.get(0).getNombre());
        assertEquals("VICTORIA", lista.get(1).getNombre());
        assertEquals("MARTIN", lista.get(0).getApellido2().get());
        assertFalse(lista.get(1).getApellido2().isPresent());
    }

    @Test
    public void test_a_texto() {

        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("prodA", 2);
        map.put("prodB", 5);

        String resultado = util.aTexto(map);

        assertEquals("prodA:2,prodB:5,", resultado);

    }
}
