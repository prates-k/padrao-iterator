package org.example;

import java.util.Iterator;

public class Censo {

    public static Integer contarClientesAtivosUnidade(Unidade unidade) {
        int quantidade = 0;
        for (Cliente cliente : unidade) {
            if (cliente.isAtivo()) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static Integer contarTotalClientesUnidade(Unidade unidade) {
        int quantidade = 0;
        for (Iterator a = unidade.iterator(); a.hasNext(); ) {
            quantidade++;
            a.next();
        }
        return quantidade;
    }

}
