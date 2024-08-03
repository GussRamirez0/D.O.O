package gt.edu.miumg;

public class Granos implements Ingrediente {
    private String tipo;

    public Granos(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String obtenerNombre() {
        return "Granos de tipo " + tipo;
    }

    @Override
    public String obtenerCantidad() {
        return "Cantidad adecuada de granos";
    }

    // Getters y Setters
    public String getTipo() {
        return tipo;
    }
}
