package gt.edu.miumg

public abstract class Cafe {
    private String nombre;
    private String tamaño;
    private double precio;
    protected List<Ingrediente> ingredientes = new ArrayList<>();

    public Cafe(String nombre, String tamaño, double precio) {
        this.nombre = nombre;
        this.tamaño = tamaño;
        this.precio = precio;
    }

    public void preparar() {
        System.out.println("Preparando " + nombre);
    }

    public void servir() {
        System.out.println("Sirviendo " + nombre);
    }

    public void agregarIngrediente(Ingrediente ingrediente) {
        ingredientes.add(ingrediente);
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public String getTamaño() {
        return tamaño;
    }

    public double getPrecio() {
        return precio;
    }
}
