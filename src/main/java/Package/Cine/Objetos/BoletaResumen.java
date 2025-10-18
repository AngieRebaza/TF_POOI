package Package.Cine.Objetos;

import java.util.Set;

public class BoletaResumen {
    private String nombreCliente;
    private String DNI;
    private int numeroSala;
    private Set<String> codigoButacas;
    private double monto;

    public BoletaResumen(String nombreCliente, String DNI, int numeroSala, Set<String> codigoButacas, double monto) {
        this.nombreCliente = nombreCliente;
        this.DNI = DNI;
        this.numeroSala = numeroSala;
        this.codigoButacas = codigoButacas;
        this.monto = monto;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public int getNumeroSala() {
        return numeroSala;
    }

    public void setNumeroSala(int numeroSala) {
        this.numeroSala = numeroSala;
    }

    public Set<String> getCodigoButacas() {
        return codigoButacas;
    }

    public void setCodigoButacas(Set<String> codigoButacas) {
        this.codigoButacas = codigoButacas;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
}

