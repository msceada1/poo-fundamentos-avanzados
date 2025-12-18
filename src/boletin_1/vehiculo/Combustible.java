package boletin_1.vehiculo;

public enum Combustible {

    DIESEL(3.5), GASOLINA(2);

    private final double precioaniadido;

    Combustible(double precioaniadido) {
        this.precioaniadido = precioaniadido;
    }

    public double getPrecioaniadido() {
        return precioaniadido;
    }
}
