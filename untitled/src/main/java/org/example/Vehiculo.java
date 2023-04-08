package org.example;

public class Vehiculo implements Producto{
    private double Costo;
    public Vehiculo(){}

    public double getCosto() {
        return Costo;
    }

    public void setCosto(double costo) {
        Costo = costo;
    }
}
