package ModuloPagos;

public class PagoDigital  implements  Pagos{

    public PagoDigital(){

    }
    @Override
    public void confirmar(String medio) {
        if (medio.equalsIgnoreCase("mercadopago")){
            System.out.println("Se ha confirmado tu pago víá Mercadopago");
        }else System.out.println("Se ha confirmado tu pago víá Paypal");
    }

    @Override
    public void autorizar(String medio) {
        if (medio.equalsIgnoreCase("mercadopago")){
            System.out.println("Se ha autorizado tu pago víá Mercadopago");
        }else System.out.println("Se ha autorizado tu pago víá Paypal");
    }


    @Override
    public void verificar(String medio) {
        if (medio.equalsIgnoreCase("mercadopago")){
            System.out.println("Se ha verificado tu pago víá Mercadopago");
        }else System.out.println("Se ha verificado tu pago víá Paypal");

    }

    @Override
    public void volverOperacion(String medio) {
        if (medio.equalsIgnoreCase("mercadopago")){
            System.out.println("Se ha confirmado su reembolso, su dinero estará disponible mañana");
        }else System.out.println("Se ha verificado su reembolso, su dinero estará disponible en una semana");
    }
}
