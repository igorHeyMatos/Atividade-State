public class ConsumidorState {
    public static void main(String[] args) {

        System.out.println("CAMINHO FELIZ:");
        System.out.println("---------------------------------");

        Pedido pedido = new Pedido();
        System.out.println("Estado atual: " + pedido.getNomeEstado());

        pedido.pagar();
        System.out.println("Estado atual: " + pedido.getNomeEstado());

        pedido.enviar();
        System.out.println("Estado atual: " + pedido.getNomeEstado());

        pedido.entregar();
        System.out.println("Estado atual: " + pedido.getNomeEstado());

        System.out.println("---------------------------------");

        System.out.println("TENTATIVA DE ENVIAR ANTES DE PAGAR:");
        System.out.println("---------------------------------");

        Pedido pedido2 = new Pedido();
        System.out.println("Estado atual: " + pedido2.getNomeEstado());

        pedido2.enviar();
        System.out.println("Estado atual: " + pedido2.getNomeEstado());

        System.out.println("---------------------------------");

        System.out.println("CANCELAMENTO DE PEDIDO:");
        System.out.println("---------------------------------");

        Pedido pedido3 = new Pedido();
        System.out.println("Estado atual: " + pedido3.getNomeEstado());

        pedido3.pagar();
        System.out.println("Estado atual: " + pedido3.getNomeEstado());

        pedido3.enviar();
        System.out.println("Estado atual: " + pedido3.getNomeEstado());

        pedido3.cancelar();
        System.out.println("Estado atual: " + pedido3.getNomeEstado());

        System.out.println("---------------------------------");
    }
}
