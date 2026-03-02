package org.alex.patrones.observer.ejemplos;

import org.alex.patrones.observer.UsuarioRepositorio;

public class EjemploObserver2 {

    public static void main(String[] args) {

        UsuarioRepositorio repositorio = new UsuarioRepositorio();

        repositorio.addObserver((obsever, user) -> System.out.println("Enviando un email al usuario " + user));
        repositorio.addObserver((obsever, user)  -> System.out.println("Enviando email al administrador"));
        repositorio.addObserver((obsever, user)  -> System.out.println("Guardando info del usuario " +
              user  + " en el logs"));
        repositorio.crearUsuario("Alex");
    }
}
