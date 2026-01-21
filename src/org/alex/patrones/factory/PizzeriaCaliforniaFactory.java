package org.alex.patrones.factory;

import org.alex.patrones.factory.producto.PizzaCaliforniaPepperoni;
import org.alex.patrones.factory.producto.PizzaCaliforniaQueso;
import org.alex.patrones.factory.producto.PizzaCaliforniaVegetariana;

public class PizzeriaCaliforniaFactory extends PizzeriaZonaAbstractFactory {

    @Override
    PizzaProducto crearPizza(String tipo) {
        return switch(tipo){
            case "queso" -> new PizzaCaliforniaQueso();
            case "pepperoni" -> new PizzaCaliforniaPepperoni();
            case "vegetariana" -> new PizzaCaliforniaVegetariana();
            default -> null;
        };
    }
}
