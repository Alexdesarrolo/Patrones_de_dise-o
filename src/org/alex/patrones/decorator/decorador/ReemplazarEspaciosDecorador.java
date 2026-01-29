package org.alex.patrones.decorator.decorador;

import org.alex.patrones.decorator.Formateable;

public class ReemplazarEspaciosDecorador extends TextoDecorador{

    public ReemplazarEspaciosDecorador(Formateable texto) {
        super(texto);
    }

    @Override
    public String darFormator() {
        return texto.darFormator().replace(" ", "_");
    }
}
