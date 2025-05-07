package DeliveryApp;

public class Main {
    public static void main(String[] args) {
        Comida pizza = ComidaFactory.crearComida("pizza");
        Comida ensalada = ComidaFactory.crearComida("ensalada");
        Comida hamburguesa = ComidaFactory.crearComida("hamburguesa");

        Pedido pedido = new Pedido();
        pedido.agregarComida(pizza);
        pedido.agregarComida(ensalada);
        pedido.agregarComida(hamburguesa);

        GestorPedidos gestor = GestorPedidos.getInstancia();
        gestor.agregarPedido(pedido);

        // Mostrar comidas creadas
        System.out.println("Comidas creadas:");
        for (Comida c : pedido.getComidas()) {
            System.out.println("- " + c.getNombre() + " S/." + c.getPrecio());
        }

        // Mostrar total
        System.out.println("\nTotal del pedido: S/." + pedido.getTotal());

        System.out.println("Estado inicial: " + pedido.getEstado());
        pedido.setEstado("en preparación");
        System.out.println("Estado actualizado: " + pedido.getEstado());

        System.out.println("\nPedidos registrados en el sistema:");
        int numero = 1;
        for (Pedido p : gestor.getPedidos()) {
            System.out.println("- Pedido #" + numero + ": " 
                + p.getComidas().size() + " comidas, estado: " + p.getEstado());
            numero++;
        }
        GestorPedidos gestor2 = GestorPedidos.getInstancia();
        System.out.println("\n¿Gestores son iguales? " + (gestor == gestor2));
    }
}
