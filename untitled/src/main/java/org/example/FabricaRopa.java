package org.example;

public class FabricaRopa extends FactoryProducto {
    @Override
    public Producto fabricarProducto() {
        return new Ropa();
    }
}
