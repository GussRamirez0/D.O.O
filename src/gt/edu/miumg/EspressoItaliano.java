package gt.edu.miumg;

public class EspressoItaliano extends Cafe {
    private int intensidad;

    public EspressoItaliano(String nombre, String tamaño, double precio, int intensidad) {
        super(nombre, tamaño, precio);
        this.intensidad = intensidad;
    }

    // Getters y Setters
    public int getIntensidad() {
        return intensidad;
    }
}
