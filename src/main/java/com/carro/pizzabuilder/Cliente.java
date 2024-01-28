package com.carro.pizzabuilder;

import java.util.*;

public class Cliente {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcion;
        while (true) {
            System.out.println("Bienvenido a la aplicación de pizzas");
            System.out.println("Elija el tipo de pizza que desea crear:");
            System.out.println("1. Pizza margarita");
            System.out.println("2. Pizza cuatro quesos");
            System.out.println("3. Pizza hawaiana");
            System.out.println("0. Salir");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    PizzaBuilder pizzaBuilder = new PizzaMargaritaBuilder();
                    Cocinero cocinero = new Cocinero(pizzaBuilder);
                    Pizza pizza = cocinero.construirPizza("Margarita", "Masa", "Salsa", "Queso",
                            new ArrayList<String>(), new ArrayList<String>());
                    System.out.println(pizza);
                    break;
                case 2:

            }
        }
    }

}
