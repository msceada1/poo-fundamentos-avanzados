package boletin_2.ejercicio_2;

public class CirculoMovible extends Forma implements Dibujable, Animable {

    private double radio;

    public CirculoMovible(double radio) {
        this.radio = radio;
    }

    @Override
    public void animar() {

    }

    @Override
    public void dibujar() {

    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(this.radio, 2);
    }
}
