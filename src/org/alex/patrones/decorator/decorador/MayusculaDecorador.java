package org.alex.patrones.decorator.decorador;

import org.alex.patrones.decorator.Formateable;

public class MayusculaDecorador extends TextoDecorador{

    public MayusculaDecorador(Formateable texto) {
        super(texto);
    }

    @Override
    public String darFormator() {
        return texto.darFormator().toUpperCase();
    }
}
