public class ConsumidorState {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        System.out.println("Estado atual: " + pedido.getNomeEstado());

        System.out.println("---------------------------------");

        pedido.pagar();
        System.out.println("Estado atual: " + pedido.getNomeEstado());

        System.out.println("---------------------------------");

        pedido.enviar();
        System.out.println("Estado atual: " + pedido.getNomeEstado());

        System.out.println("---------------------------------");

        pedido.entregar();
        System.out.println("Estado atual: " + pedido.getNomeEstado());

        System.out.println("---------------------------------");

        pedido.cancelar();
        System.out.println("Estado atual: " + pedido.getNomeEstado());
    }
}
