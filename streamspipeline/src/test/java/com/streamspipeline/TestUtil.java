package com.streamspipeline;

import static org.junit.Assert.*;

import java.util.List;
import java.util.stream.Collectors;

import org.junit.Before;
import org.junit.Test;

public class TestUtil {

    private PersonaUtil util;

    @Before
    public void init() {
        util = new PersonaUtil();
    }

    @Test
    public void test_apellido2_null() {
        List<Persona> resultado = util.listaSinApellido2().collect(Collectors.toList());
        assertEquals(1, resultado.size());
        assertEquals("John", resultado.get(0).getNombre());
    }

    @Test
    public void test_obtener_nombres() {
        List<String> resultado = util.listaNombres().collect(Collectors.toList());

        assertEquals(3, resultado.size());
        assertEquals("Antonia", resultado.get(0));
        assertEquals("John", resultado.get(1));
        assertEquals("Pedro", resultado.get(2));

    }

    @Test
    public void test_obtener_apellido1() {
        List<String> resultado = util.listaApellido1Ordenada().collect(Collectors.toList());

        assertEquals(3, resultado.size());
        assertEquals("Garcia", resultado.get(0));
        assertEquals("Llull", resultado.get(1));
        assertEquals("smith", resultado.get(2));

    }
}
