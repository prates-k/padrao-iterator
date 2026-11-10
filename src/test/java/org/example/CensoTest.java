package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CensoTest {

    @Test
    void deveContarClientesAtivosUnidade() {
        Unidade unidade = new Unidade(
                new Cliente("Marco", true),
                new Cliente("Antonio", true),
                new Cliente("Jose", false),
                new Cliente("Maria", true)
        );
        assertEquals(3, Censo.contarClientesAtivosUnidade(unidade));
    }

    @Test
    void deveContarTotalClientesUnidade() {
        Unidade unidade = new Unidade(
                new Cliente("Marco", true),
                new Cliente("Antonio", true),
                new Cliente("Jose", false),
                new Cliente("Maria", true)
        );
        assertEquals(4, Censo.contarTotalClientesUnidade(unidade));
    }

}