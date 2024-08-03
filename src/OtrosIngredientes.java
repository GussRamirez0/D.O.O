public class OtrosIngredientes implements Ingrediente {
    private String nombre;
    private int cantidad;

    public OtrosIngredientes(String nombre, int cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    @Override
    public String obtenerNombre() {
        return nombre;
    }

    @Override
    public String obtenerCantidad() {
        return cantidad + " unidades";
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }
}
