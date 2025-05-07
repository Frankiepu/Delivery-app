
package DeliveryApp;

public class ComidaFactory {
    public static Comida crearComida(String tipo) {
        switch (tipo.toLowerCase()) {
            case "pizza": return new Pizza();
            case "hamburguesa": return new Hamburguesa();
            case "ensalada": return new Ensalada();
            default: throw new IllegalArgumentException("Tipo no válido");
        }
    }
}

