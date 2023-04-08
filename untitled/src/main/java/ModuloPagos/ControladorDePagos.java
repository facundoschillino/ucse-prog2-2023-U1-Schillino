package ModuloPagos;

public class ControladorDePagos {

    public ControladorDePagos(){
    }
    public void Pagar(ProcesadorDePagos medioDePago, int monto){
        ProcesadorDePagos procesadorDePagos = medioDePago;
        procesadorDePagos.setPagos(new PagoDigital());
        procesadorDePagos.ProcessPayment();
    }

}
