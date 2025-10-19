package Package.Cine.Objetos;

public class Butacas {
    private String codigo;
    private boolean ocupado;
    private boolean seleccionado;

    public Butacas(String codigo, boolean ocupado) {
        this.codigo = codigo;
        this.ocupado = ocupado;
        this.seleccionado = false;
    }

    public String getCodigo() {
        return codigo;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public boolean isSeleccionado() {
        return seleccionado;
    }

    public void setSeleccionado(boolean seleccionado) {
        this.seleccionado = seleccionado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }
}
