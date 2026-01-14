package boletin_2.ejercicio_2;

public class Circulo extends Forma implements Dibujable {

    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }


    @Override
    public void dibujar() {

    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(this.radio, 2);
    }
}
