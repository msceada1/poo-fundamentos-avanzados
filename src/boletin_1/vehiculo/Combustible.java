package boletin_1.vehiculo;

public enum Combustible {

    GASOLINA(3.5), DIESEL(2);

    final double precioCombustible;

    Combustible(double precioCombustible) {
        this.precioCombustible = precioCombustible;
    }

    public double getPrecioCombustible() {
        return precioCombustible;
    }
}
