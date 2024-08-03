package gt.edu.miumg;

public class CafeColombiano extends Cafe {
    private String tipoGrano;

    public CafeColombiano(String nombre, String tamaño, double precio, String tipoGrano) {
        super(nombre, tamaño, precio);
        this.tipoGrano = tipoGrano;
    }

    // Getters y Setters
    public String getTipoGrano() {
        return tipoGrano;
    }
}
