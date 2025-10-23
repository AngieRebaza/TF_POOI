package Package.Cine.Objetos;

public class Usuario {
    private String nombre;
    private String gmail;
    private String DNI;

    public Usuario(String nombre, String gmail, String DNI) {
        this.nombre = nombre;
        this.gmail = gmail;
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public String getDNI()B {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", gmail='" + gmail + '\'' +
                ", DNI='" + DNI + '\'' +
                '}';
    }
}
