package ModuloPoductos;

public class FabricaVehiculos extends FactoryProducto{
    @Override
    public Producto fabricarProducto() {
        return new Vehiculo();
    }
}
