public class CanceladoState implements EstadoPedido {
    @Override
    public void pagar(Pedido pedido) {
        System.out.println("Não é possível pagar um pedido que foi cancelado!");
    }

    @Override
    public void enviar(Pedido pedido) {
        System.out.println("Não é possível enviar um pedido que foi cancelado!");
    }

    @Override
    public void entregar(Pedido pedido) {
        System.out.println("Não é possível entregar um pedido que foi cancelado!");
    }

    @Override
    public void cancelar(Pedido pedido) {
        System.out.println("O pedido já está cancelado!");
    }
}
