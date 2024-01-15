package com.carro.pizzabuilder;

public interface PizzaBuilder {

    public void setNombre(String nombre);

    public void setMasa(String masa);

    public void setSalsa(String salsa);

    public void setQueso(String queso);

    public void removeIngrediente(String ingrediente);

    public void addIngrediente(String ingrediente);

    public Pizza getPizza();
}
