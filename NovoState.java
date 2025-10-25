public class NovoState implements EstadoPedido {
    @Override
    public void pagar(Pedido pedido) {
        System.out.println("Pagamento confirmado do pedido!");
        pedido.setEstado(new PagoState());
    }

    @Override
    public void enviar(Pedido pedido) {
        System.out.println("Não é possível enviar um pedido que ainda não foi realizado pagamento!");
    }

    @Override
    public void entregar(Pedido pedido) {
        System.out.println("O pedido precisa ser enviado antes da entrega!");
    }

    @Override
    public void cancelar(Pedido pedido) {
        System.out.println("Pedido cancelado com sucesso!");
        pedido.setEstado(new CanceladoState());
    }
}
