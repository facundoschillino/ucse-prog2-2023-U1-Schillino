package ModuloPoductos;

import ModuloTransporte.CalculadorDeEnvios;
import ModuloTransporte.Transporte;
import ModuloTransporte.TransporteAvion;
import ModuloTransporte.TransporteCamion;

public class Main {
    public static void main(String[] args) {

        //prueba pagos
        //ControladorDePagos controlador = new ControladorDePagos();
        //ProcesadorDePagos procesador = new PagarMercadopago();
        //controlador.Pagar(procesador, 1800);
        //procesador = new PagarPaypal();
        //controlador.Pagar(procesador, 1800);


        //prueba envios
        CalculadorDeEnvios calculador = new CalculadorDeEnvios();
        Transporte transporte;
        transporte = new TransporteAvion();
        Vehiculo coche = new Vehiculo();
        coche.setCosto(200);
        transporte.setProducto(coche);
        calculador.setTransporte(transporte);
        calculador.setAlto(100);
        calculador.setAncho(100);
        calculador.setLargo(100);
        calculador.setPeso(100);
        calculador.setDestino("BSAS");
        calculador.setOrigen("Rafaela");
        calculador.CalcularCosto();
        //cambio de tipo.
        transporte = new TransporteCamion();
        transporte.setProducto(coche);
        calculador.setTransporte(transporte);
        calculador.setPeso(100);
        calculador.setAlto(100);
        calculador.setAncho(100);
        calculador.setLargo(100);
        calculador.setDestino("BSAS");
        calculador.setOrigen("Rafaela");
        calculador.CalcularCosto();
    }
}