package Package.Cine.Objetos;

public class PeliculasCartelera {
    private String titulo;
    private String trama;
    private int duracionMinutos;
    private int sala;
    private String horario;


    public PeliculasCartelera(String titulo, String trama, int duracionMinutos, int sala, String horario) {
        this.titulo = titulo;
        this.trama = trama;
        this.duracionMinutos = duracionMinutos;
        this.sala = sala;
        this.horario = horario;
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

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getSala() {
        return sala;
    }

    public void setSala(int sala) {
        this.sala = sala;
    }
}
