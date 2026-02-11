package org.alex.patrones.decorator2;

import org.alex.patrones.decorator2.decorador.ConChocolateDecorador;
import org.alex.patrones.decorator2.decorador.ConCremaDecorador;
import org.alex.patrones.decorator2.decorador.ConLecheDecorador;

public class EjemploDecoradorCafe {

    public static void main(String[] args) {

        Configurable cafe = new Cafe( 7, "Café Moca");
        ConCremaDecorador conCrema = new ConCremaDecorador(cafe);
        ConLecheDecorador conLeche = new ConLecheDecorador(conCrema);
        ConChocolateDecorador conChoco = new ConChocolateDecorador(conLeche);

        System.out.println("El precio del café moca es: " + conChoco.getPrecioBase());
        System.out.println("Los ingredientes: " + conChoco.getIngredientes());

        Configurable capuchino = new Cafe(4, "Cafe Capuchino");
        conCrema = new ConCremaDecorador(capuchino);
        conLeche = new ConLecheDecorador(conCrema);
        System.out.println("El precio del capuchino es " + conLeche.getPrecioBase());
        System.out.println("Los Ingredientes " + conLeche.getIngredientes());

        Configurable espresso = new Cafe(3, "Café Espresso");
        System.out.println("El precio del café espresso es " + espresso.getPrecioBase());
        System.out.println("Los ingredientes del café espresso es: " + espresso.getIngredientes());
    }
}
