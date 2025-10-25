public class EnviadoState implements EstadoPedido {
    @Override
    public void pagar(Pedido pedido) {
        System.out.println("O pedido já foi pago e enviado!");
    }

    @Override
    public void enviar(Pedido pedido) {
        System.out.println("O pedido já foi enviado!");
    }

    @Override
    public void entregar(Pedido pedido) {
        System.out.println("Pedido foi entregue ao cliente!");
        pedido.setEstado(new EntregueState());
    }

    @Override
    public void cancelar(Pedido pedido) {
        System.out.println("Não é possível cancelar um pedido já enviado!");
    }
}
