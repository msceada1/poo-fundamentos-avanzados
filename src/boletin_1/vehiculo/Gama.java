package boletin_1.vehiculo;

public enum Gama {

    GAMABAJA(30), GAMAMEDIA(40), GAMAALTA(50);

    private final double precioBase;

    Gama(double precioBase) {
        this.precioBase = precioBase;
    }

    public double getPrecioBase() {
        return precioBase;
    }
}
