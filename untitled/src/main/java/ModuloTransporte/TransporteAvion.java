package ModuloTransporte;

import org.example.Producto;

public class TransporteAvion implements Transporte{
    private Producto producto;
    @Override
    public double CalcularCosto(int peso, int Largo, int ancho, int alto, String origen, String destino) {
        double total = producto.getCosto();
        if (PrecioPorDimensiones(Largo,ancho,alto) == "Grande"){
            total += total*0.10;
        }
        if (peso > 100 ){
            total += total*0.10;
        }
        //Implementación con el destino
        return total + 0.10;
    }

    @Override
    public void setProducto(Producto producto) {
        this.producto = producto;
    }
}
