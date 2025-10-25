public class Pedido {
    private EstadoPedido estado;

    public Pedido() {
        this.estado = new NovoState();
    }

    public void setEstado(EstadoPedido estado) {
        this.estado = estado;
    }

    public void pagar() {
        estado.pagar(this);
    }

    public void enviar() {
        estado.enviar(this);
    }

    public void entregar() {
        estado.entregar(this);
    }

    public void cancelar() {
        estado.cancelar(this);
    }

    public String getNomeEstado() {
        return estado.getClass().getSimpleName();
    }
}
