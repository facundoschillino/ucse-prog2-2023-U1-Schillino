package ModuloTransporte;

import ModuloPoductos.Producto;

public interface Transporte {

    double CalcularCosto(int peso, int Largo, int ancho, int alto, String origen, String destino);
    public default String PrecioPorDimensiones(int Largo, int Ancho, int Alto){
        int dimension  = Largo * Ancho * Alto;
        if (dimension < 100){
            return ("Chico");
        }else return "Grande";
    }
    void setProducto(Producto producto);
}
