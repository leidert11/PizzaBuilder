package com.carro.pizzabuilder;

public class PizzaHawaianaBuilder {
     private Pizza pizza;

    public PizzaHawaianaBuilder() {
        pizza = new Pizza();
    }

    public void setNombre(String nombre) {
        pizza.setNombre(nombre);
    }

    public void setMasa(String masa) {
        pizza.setMasa(masa);
    }

    public void setSalsa(String salsa) {
        pizza.setSalsa(salsa);
    }

    public void setQueso(String queso) {
        pizza.setQueso(queso);
    }

    public void addIngrediente(String ingrediente) {
        pizza.addIngrediente(ingrediente);
    }

    public void removeIngrediente(String ingrediente) {
        pizza.removeIngrediente(ingrediente);
    }

    public Pizza getPizza() {
        return pizza;
    }
}
