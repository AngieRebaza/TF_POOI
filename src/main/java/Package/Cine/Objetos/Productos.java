package Package.Cine.Objetos;

public class Productos {
    private String nombreSnack;
    private double precioSnack;

    public Productos(double precioSnack, String nombreSnack) {
        this.precioSnack = precioSnack;
        this.nombreSnack = nombreSnack;
    }

    public double getPrecioSnack() {
        return precioSnack;
    }

    public void setPrecioSnack(double precioSnack) {
        this.precioSnack = precioSnack;
    }

    public String getNombreSnack() {
        return nombreSnack;
    }

    public void setNombreSnack(String nombreSnack) {
        this.nombreSnack = nombreSnack;
    }
}
