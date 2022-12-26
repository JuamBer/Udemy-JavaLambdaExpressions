package com.reduccionesmutables;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.Test;

public class TestReducciones {

    private ReduccionesUtil util = new ReduccionesUtil();

    @Test
    public void test_obteSinNulosYMayusculas() {

        List<String> original = Arrays.asList("primero", null, "segundo");

        Collection<String> resultado = util.obtenSinNulosYMayusculas(original);

        assertEquals(2, resultado.size());
        assertTrue(resultado.contains("PRIMERO"));
        assertTrue(resultado.contains("SEGUNDO"));

    }

    @Test
    public void test_acumula_pares_impares() {

        List<Integer> lista = Arrays.asList(2, 3, 1, 5);

        int[] resultado = util.paresImpares(lista);

        assertEquals(1, resultado[0]);
        assertEquals(3, resultado[1]);
    }

}
