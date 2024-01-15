package com.carro.pizzabuilder;

import java.util.ArrayList;

public class Pizza {

    private String nombre;
    private ArrayList<String> ingredientes;
    private double precio;
    private String masa;
    private String salsa;
    private String queso;

    public Pizza(String nombre, ArrayList<String> ingredientes, double precio) {
        this.nombre = nombre;
        this.ingredientes = ingredientes;
        this.precio = precio;
        this.masa = masa;
        this.salsa = salsa;
        this.salsa = queso;

    }

    public Pizza() {
        this.nombre = "";
        this.ingredientes = new ArrayList<>();
        this.precio = 0.0;
    }

    public void addIngrediente(String ingrediente) {
        this.addIngrediente(ingrediente);
    }

    public void removeIngrediente(String ingrediente) {
        this.removeIngrediente(ingrediente);
    }

    public void setMasa(String masa) {
        this.masa = masa;
    }

    public void setSalsa(String salsa) {
        this.salsa = salsa;
    }

    public void setQueso(String queso) {
        this.queso = queso;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setIngredientes(ArrayList<String> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Pizza : " + " nombre " + nombre + ", ingredientes " + ingredientes + ", precio " + precio;
    }

}
