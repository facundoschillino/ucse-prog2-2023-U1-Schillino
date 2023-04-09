package ModuloPoductos;

public class FabricaElectronica extends FactoryProducto{

    @Override
    public Producto fabricarProducto() {
        return new Electronica();
    }
}
