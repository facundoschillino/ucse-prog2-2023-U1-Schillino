package ModuloPagos;

public class PagarMercadopago extends ProcesadorDePagos {

    public PagarMercadopago (Pagos pago){
        this.pagos = pago;
    }
    public PagarMercadopago(){

    }
    @Override
    public void ProcessPayment() {
        pagos.verificar("mercadopago");
        pagos.autorizar("mercadopago");
        pagos.confirmar("mercadopago");

    }
    @Override
    public void refundPayment() {
    pagos.volverOperacion("mercadopago");

    }
}
