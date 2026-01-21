package org.alex.patrones.factory;

import org.alex.patrones.factory.producto.PizzaNewYorkPepperoni;
import org.alex.patrones.factory.producto.PizzaNewYorkVegetariana;
import org.alex.patrones.factory.producto.PizzanewYorkItaliana;

public class PizzeriaNewYorkFactory extends PizzeriaZonaAbstractFactory{


    @Override
    PizzaProducto crearPizza(String tipo) {

        return switch (tipo){
            case "vegetariana" -> new PizzaNewYorkVegetariana();
            case "pepperoni" -> new PizzaNewYorkPepperoni();
            case "italiana" -> new PizzanewYorkItaliana();
            default -> null;
        };
    }
}
