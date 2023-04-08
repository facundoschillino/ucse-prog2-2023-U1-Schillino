package ModuloTransporte;

import org.example.Producto;

public class TransporteCamion implements Transporte{

    private Producto producto;
    @Override
    public double CalcularCosto(int peso, int Largo, int ancho, int alto, String origen, String destino) {

        double tota = producto.getCosto();

        if (PrecioPorDimensiones(Largo,ancho,alto) == "Grande"){
            tota += tota*0.30;
        }
        if (peso > 100 ){
            tota += tota*0.40;
        }
        //Implementación con el destino
        return tota + 0.1;
    }

    @Override
    public void setProducto(Producto producto) {
        this.producto = producto;
    }
}
