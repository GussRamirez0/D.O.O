public class Agua implements Ingrediente {
    private double cantidad;

    public Agua(double cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String obtenerNombre() {
        return "Agua";
    }

    @Override
    public String obtenerCantidad() {
        return cantidad + " ml";
    }

    // Getters y Setters
    public double getCantidad() {
        return cantidad;
    }
}
