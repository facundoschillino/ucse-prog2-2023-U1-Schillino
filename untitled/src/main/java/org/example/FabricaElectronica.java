package org.example;

public class FabricaElectronica extends FactoryProducto{

    @Override
    public Producto fabricarProducto() {
        return new Electronica();
    }
}
