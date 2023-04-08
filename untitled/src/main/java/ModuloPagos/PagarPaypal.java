package ModuloPagos;

public class PagarPaypal extends ProcesadorDePagos {

    public PagarPaypal(){

    }
    public PagarPaypal (Pagos pago){
        this.pagos = pago;
    }
    @Override
    public void ProcessPayment() {
    pagos.verificar("Paypal");
    pagos.autorizar("Paypal");
    pagos.confirmar("Paypal");
    }

    @Override
    public void refundPayment() {
    pagos.volverOperacion("Paypal");
    }
}
