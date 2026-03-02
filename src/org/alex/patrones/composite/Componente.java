package org.alex.patrones.composite;

import java.util.Objects;

abstract public class Componente {
    protected String nombre;

    public Componente(String nombre){
        this.nombre = nombre;
    }

    abstract public String mostar(int nivel);
    abstract public boolean buscar(String nombre);

    public String getNombre() {
        return nombre;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        Componente that = (Componente) object;
        return Objects.equals(nombre, that.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nombre);
    }
}
