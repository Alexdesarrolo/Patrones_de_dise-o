package org.alex.patrones.decorator.decorador;

import org.alex.patrones.decorator.Formateable;

public class ReversaDecorador extends TextoDecorador{

    public ReversaDecorador(Formateable texto) {
        super(texto);
    }

    @Override
    public String darFormator() {
        StringBuilder sb = new StringBuilder(texto.darFormator());
        return sb.reverse().toString();
    }
}
