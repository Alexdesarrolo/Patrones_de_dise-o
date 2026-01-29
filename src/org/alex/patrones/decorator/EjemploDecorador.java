package org.alex.patrones.decorator;

import org.alex.patrones.decorator.decorador.MayusculaDecorador;
import org.alex.patrones.decorator.decorador.ReemplazarEspaciosDecorador;
import org.alex.patrones.decorator.decorador.ReversaDecorador;
import org.alex.patrones.decorator.decorador.SubrayadoDecorador;

public class EjemploDecorador {

    public static void main(String[] args) {

        Formateable texto = new Texto("Hola que tal Alex!");

        // Esto es el patrón de diseño decorador, si hubieramos usado la herencia hubieran sido alrededor de 16 clases
        MayusculaDecorador mayuscula = new MayusculaDecorador(texto);
        //ReversaDecorador reversa = new ReversaDecorador(mayuscula);
        SubrayadoDecorador subrayar = new SubrayadoDecorador(mayuscula);
        ReemplazarEspaciosDecorador remplazar = new ReemplazarEspaciosDecorador(subrayar);

        System.out.println(remplazar.darFormator());
    }
}
