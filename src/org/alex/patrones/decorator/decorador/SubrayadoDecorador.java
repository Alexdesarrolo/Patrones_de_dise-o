package org.alex.patrones.decorator.decorador;

import org.alex.patrones.decorator.Formateable;

public class SubrayadoDecorador extends TextoDecorador{

    public SubrayadoDecorador(Formateable texto) {
        super(texto);
    }

    @Override
    public String darFormator() {
        int largo = texto.darFormator().length();
        StringBuilder sb = new StringBuilder(texto.darFormator());
        sb.append("\n");
        for(int i = 0; i < largo; i++){
            sb.append("_");
        }
        return sb.toString();
    }
}
