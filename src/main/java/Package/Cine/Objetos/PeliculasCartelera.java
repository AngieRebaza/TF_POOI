package Package.Cine.Objetos;

public class PeliculasCartelera {
    private String titulo;
    private String trama;
    private int duracionMinutos;

    public PeliculasCartelera(String titulo, String trama, int duracionMinutos) {
        this.titulo = titulo;
        this.trama = trama;
        this.duracionMinutos = duracionMinutos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTrama() {
        return trama;
    }

    public void setTrama(String trama) {
        this.trama = trama;
    }

    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    public void setDuracionMinutos(int duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }
}
