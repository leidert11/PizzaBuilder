package com.carro.pizzabuilder;

import java.util.*;

public class Cocinero {
    private PizzaBuilder builder;

    public Cocinero(PizzaBuilder builder) {
        this.builder = builder;
    }

    public Pizza construirPizza(String nombre, String masa, String salsa, String queso, ArrayList<String> ingredientes,
            ArrayList<String> quitar) {
        builder.setNombre(nombre);
        builder.setMasa(masa);
        builder.setSalsa(salsa);
        builder.setQueso(queso);
        
        for (String ingrediente : ingredientes) {
            builder.addIngrediente(ingrediente);
        }

        for (String ingrediente : quitar) {
            builder.removeIngrediente(ingrediente);
        }

        return builder.getPizza();
    }
}
