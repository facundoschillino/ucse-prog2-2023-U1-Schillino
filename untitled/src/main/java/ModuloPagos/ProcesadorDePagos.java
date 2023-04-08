package ModuloPagos;

public abstract class ProcesadorDePagos {


    public Pagos pagos;

    public void setPagos(Pagos pagos) {
        this.pagos = pagos;
    }

    public abstract void ProcessPayment();
    public abstract void refundPayment();


}
