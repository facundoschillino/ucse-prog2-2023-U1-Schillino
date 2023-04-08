package ModuloTransporte;

public class CalculadorDeEnvios {

    private Transporte transporte;
    private int Ancho;
    private int Alto;
    private int Largo;
    private int Peso;
    private String Destino;
    private String Origen;

    public CalculadorDeEnvios(){}
    public void CalcularCosto(){
        System.out.println("El costo del envio es" + this.transporte.CalcularCosto(this.Peso, this.Largo, this.Ancho, this.Alto, this.Origen, this.Destino)); ;
    }

    public Transporte getTransporte() {
        return transporte;
    }

    public void setTransporte(Transporte transporte) {
        this.transporte = transporte;
    }

    public int getAncho() {
        return Ancho;
    }

    public void setAncho(int ancho) {
        Ancho = ancho;
    }

    public int getAlto() {
        return Alto;
    }

    public void setAlto(int alto) {
        Alto = alto;
    }

    public int getLargo() {
        return Largo;
    }

    public void setLargo(int largo) {
        Largo = largo;
    }

    public int getPeso() {
        return Peso;
    }

    public void setPeso(int peso) {
        Peso = peso;
    }

    public String getDestino() {
        return Destino;
    }

    public void setDestino(String destino) {
        Destino = destino;
    }

    public String getOrigen() {
        return Origen;
    }

    public void setOrigen(String origen) {
        Origen = origen;
    }
}
