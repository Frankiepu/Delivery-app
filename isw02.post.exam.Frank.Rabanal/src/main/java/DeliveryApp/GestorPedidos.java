package DeliveryApp;

import java.util.ArrayList;
import java.util.List;

public class GestorPedidos {
    private static GestorPedidos instancia;
    private List<Pedido> pedidos = new ArrayList<>();

    private GestorPedidos() {
    }

    public static GestorPedidos getInstancia() {
        if (instancia == null) {
            instancia = new GestorPedidos();
        }
        return instancia;
    }

    public void agregarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }
}
