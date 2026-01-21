package org.alex.patrones.factory.producto;

import org.alex.patrones.factory.PizzaProducto;

public class PizzanewYorkItaliana extends PizzaProducto {

    public PizzanewYorkItaliana() {
        super();
        nombre = "Pizza italiana New York";
        masa = "Masa gruesa";
        salsa = "Salsa de tomate italiano carne";
        ingredientes.add("Quezo mozzarella");
        ingredientes.add("Aceitunas");
        ingredientes.add("Jamón");
        ingredientes.add("Choricillo");
        ingredientes.add("Champinones");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando por 30 min. a 120°C");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en triángulos grandes");
    }
}
