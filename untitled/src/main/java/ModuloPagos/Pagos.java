package ModuloPagos;

public interface Pagos {
    void confirmar(String medio);
    void autorizar(String medio);
    void verificar(String medio);
    void volverOperacion(String medio);
}
