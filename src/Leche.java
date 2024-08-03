public class Leche implements Ingrediente {
    private String tipo;
    private double cantidad;

    public Leche(String tipo, double cantidad) {
        this.tipo = tipo;
        this.cantidad = cantidad;
    }

    @Override
    public String obtenerNombre() {
        return "Leche " + tipo;
    }

    @Override
    public String obtenerCantidad() {
        return cantidad + " ml";
    }

    // Getters y Setters
    public String getTipo() {
        return tipo;
    }

    public double getCantidad() {
        return cantidad;
    }
}
