public class Persona {
    private String nombre;

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                '}';
    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }
}
