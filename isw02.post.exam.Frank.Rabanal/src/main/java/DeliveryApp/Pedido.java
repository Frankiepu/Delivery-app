package DeliveryApp;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<Comida> comidas = new ArrayList<>();
    private String estado = "pendiente";

    public void agregarComida(Comida comida) {
        comidas.add(comida);
    }

    public double getTotal() {
        double total = 0;
        for (Comida comida : comidas) {
            total += comida.getPrecio();
        }
        return total;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public List<Comida> getComidas() {
        return comidas;
    }
}
