public class PagoState implements EstadoPedido {
    @Override
    public void pagar(Pedido pedido) {
        System.out.println("O pedido já foi pago!");
    }

    @Override
    public void enviar(Pedido pedido) {
        System.out.println("Pedido enviado ao cliente!");
        pedido.setEstado(new EnviadoState());
    }

    @Override
    public void entregar(Pedido pedido) {
        System.out.println("O pedido precisa ser enviado antes da entrega!");
    }

    @Override
    public void cancelar(Pedido pedido) {
        System.out.println("Pedido cancelado e pagamento estornado!");
        pedido.setEstado(new CanceladoState());
    }
}
