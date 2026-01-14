package boletin_2.ejercicio_2;

public class Rectangulo extends Forma implements Dibujable {

    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }


    @Override
    public void dibujar() {

    }

    @Override
    public double calcularArea() {
        return this.base * this.altura;
    }
}
