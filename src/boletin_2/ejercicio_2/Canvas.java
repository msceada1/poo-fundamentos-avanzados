package boletin_2.ejercicio_2;

public class Canvas {

    public static void main(String[] args) {

        CirculoMovible circuloMovible = new CirculoMovible(4);
        Rectangulo rectangulo = new Rectangulo(2, 4);
        Circulo circulo = new Circulo(6);
        CirculoMovible circuloMovible1 = new CirculoMovible(5);

        Forma[] myArray = new Forma[4];
        myArray[0] = circuloMovible;
        myArray[1] = rectangulo;
        myArray[2] = circulo;
        myArray[3] = circuloMovible1;

        dibujarYAnimarFormas(myArray);
    }

    public static void dibujarYAnimarFormas(Forma[] formas) {
        for (int i = 0; i < formas.length; i++) {
            if (formas[i] instanceof Dibujable && formas[i] instanceof Animable) {
                System.out.println(formas[i]);
            }
        }
    }
}
