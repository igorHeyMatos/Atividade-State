public class EntregueState implements EstadoPedido {
    @Override
    public void pagar(Pedido pedido) {
        System.out.println("O pedido já foi finalizado e entregue!");
    }

    @Override
    public void enviar(Pedido pedido) {
        System.out.println("O pedido já foi entregue ao cliente!");
    }

    @Override
    public void entregar(Pedido pedido) {
        System.out.println("O pedido já foi entregue!");
    }

    @Override
    public void cancelar(Pedido pedido) {
        System.out.println("Não é possível cancelar um pedido já entregue!");
    }
}
