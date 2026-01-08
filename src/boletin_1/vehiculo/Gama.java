package boletin_1.vehiculo;

public enum Gama {

    BAJA(30), MEDIA(40), ALTA(50);

    final int precioAlquiler;

    Gama(int precioAlquiler) {
        this.precioAlquiler = precioAlquiler;
    }

    public int getPrecioAlquiler() {
        return precioAlquiler;
    }
}
