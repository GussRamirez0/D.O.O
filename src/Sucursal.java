public class Sucursal {
    private String nombre;
    private String direccion;
    private List<Empleado> empleados = new ArrayList<>();
    private List<Ingrediente> ingredientes = new ArrayList<>();
    private List<Equipo> equipos = new ArrayList<>();
    private List<Cafe> especialidades = new ArrayList<>();

    public Sucursal(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public void agregarIngrediente(Ingrediente ingrediente) {
        ingredientes.add(ingrediente);
    }

    public void agregarEquipo(Equipo equipo) {
        equipos.add(equipo);
    }

    public void agregarEspecialidad(Cafe cafe) {
        especialidades.add(cafe);
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public List<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public List<Equipo> getEquipos() {
        return equipos;
    }

    public List<Cafe> getEspecialidades() {
        return especialidades;
    }
}
