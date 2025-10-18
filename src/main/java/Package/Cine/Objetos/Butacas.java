package Package.Cine.Objetos;

public class Butacas {
    private String codigo;
    private boolean ocupado;

    public Butacas(String codigo, boolean ocupado) {
        this.codigo = codigo;
        this.ocupado = ocupado;
    }

    public String getCodigo() {
        return codigo;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }
}
