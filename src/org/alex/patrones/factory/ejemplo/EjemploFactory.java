package org.alex.patrones.factory.ejemplo;

import org.alex.patrones.factory.PizzaProducto;
import org.alex.patrones.factory.PizzeriaCaliforniaFactory;
import org.alex.patrones.factory.PizzeriaNewYorkFactory;
import org.alex.patrones.factory.PizzeriaZonaAbstractFactory;

public class EjemploFactory {

    public static void main(String[] args) {

        PizzeriaZonaAbstractFactory ny = new PizzeriaNewYorkFactory();
        PizzeriaCaliforniaFactory california = new PizzeriaCaliforniaFactory();

        PizzaProducto pizza =  california.ordenarPizza("queso");
        System.out.println("Bruce ordena la pizza " + pizza.getNombre());

        pizza = ny.ordenarPizza("pepperoni");
        System.out.println("Andrés ordena una " + pizza.getNombre());

        pizza = california.ordenarPizza("vegetariana");
        System.out.println("James ordena " +pizza.getNombre());

        pizza = ny.ordenarPizza("vegetariana");
        System.out.println("Linus ordena la pizza " + pizza.getNombre());

        pizza = california.ordenarPizza("pepperoni");
        System.out.println("Jhon ordena la pizza " + pizza.getNombre());

        System.out.println("pizza = " + pizza);

    }
}
