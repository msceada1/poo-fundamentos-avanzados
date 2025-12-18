package boletin_1.vehiculo;

public abstract class Vehiculo {

    private String matricula;
    private int numDias;
    private Gama gama;

    public Vehiculo(String matricula, int numDias, Gama gama) {
        this.matricula = matricula;
        this.numDias = numDias;
        this.gama = gama;
    }
}
