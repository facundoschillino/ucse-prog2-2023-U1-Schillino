package ModuloTransporte;

import ModuloPoductos.Producto;

public class TransporteBarco implements  Transporte{

    private Producto producto;
    @Override
    public double CalcularCosto(int peso, int Largo, int ancho, int alto, String origen, String destino) {
        double total = producto.getCosto();
        if (PrecioPorDimensiones(Largo,ancho,alto) == "Grande"){
            total += total*0.3;
        }
        //Implementación con el destino
        return total + 0.5;
    }

    @Override
    public void setProducto(Producto producto) {
        this.producto = producto;
    }
}
