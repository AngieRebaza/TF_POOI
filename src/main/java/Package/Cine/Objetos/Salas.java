package Package.Cine.Objetos;

import java.util.LinkedHashMap;

public class Salas {
    private int numSala;
    private String piso;
    private LinkedHashMap<String, Butacas> butacas;

    public Salas(int numSala, String piso) {
        this.numSala = numSala;
        this.piso = piso;
        this.butacas = new LinkedHashMap<>();
        codigoButacas();
    }

    private void codigoButacas(){
        char fila = 'A';
        for (int i = 1; i<=20; i++) {
            String codigo = fila + String.valueOf(i);

            butacas.put(codigo, new Butacas(codigo, false));

            }

        }

    public void butacaOcupada(String codigo) {
        Butacas asiento = butacas.get(codigo);
        if (asiento != null) asiento.setOcupado(true);

    }

    public int getNumSala() {
        return numSala;
    }

    public String getPiso() {
        return piso;
    }

    public LinkedHashMap<String, Butacas> getButacas() {
        return butacas;

    }

}
