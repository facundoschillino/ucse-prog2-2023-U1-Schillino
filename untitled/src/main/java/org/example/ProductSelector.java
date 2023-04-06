package org.example;

public  class ProductSelector {
    FactoryProducto fabrica;
    Producto producto;
    public Producto fabricar(Producto producto){
        if (producto instanceof Vehiculo){
            fabrica = new FabricaVehiculos();
            producto = fabrica.fabricarProducto();
        }else if (producto instanceof Ropa){
            fabrica = new FabricaRopa();
            producto = fabrica.fabricarProducto();
        }else {
            fabrica = new FabricaElectronica();
            producto = fabrica.fabricarProducto();
        }
        return producto;
    }
}
