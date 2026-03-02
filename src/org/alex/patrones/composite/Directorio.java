package org.alex.patrones.composite;

import java.util.ArrayList;
import java.util.List;

public class Directorio extends Componente{

    List<Componente> hijos;

    public Directorio(String nombre) {
        super(nombre);
        this.hijos = new ArrayList<>();
    }

    public Directorio addComponente(Componente c){
        hijos.add(c);
        return this;
    }

    public void removeComponente(Componente c){
        hijos.remove(c);
    }

    @Override
    public String mostar(int nivel) {

        StringBuilder sb = new StringBuilder("\t".repeat(nivel));
        sb.append(nombre)
                .append("/")
                .append("\n");

        for (Componente hijo: hijos){
            sb.append(hijo.mostar(nivel+1));
            if(hijo instanceof Archivo){ // analizar sin el condicional
                sb.append("\n");
            }

        }
        return sb.toString();
    }

    @Override
    public boolean buscar(String nombre) {
        if(this.nombre.equalsIgnoreCase(nombre)){
            return true;
        }

//        for(Componente hijo: this.hijos){
//            if(hijo.buscar(nombre)){
//                return true;
//            }
//        }
        //return false;

        return hijos.stream().anyMatch(h -> h.buscar(nombre));
    }
}
