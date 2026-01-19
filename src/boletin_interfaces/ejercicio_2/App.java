package boletin_interfaces.ejercicio_2;

public class App {

    public static void main(String[] args) {

        Lampara l = new Lampara();
        Televisor t = new Televisor();

        l.apagar();
        l.encender();
        t.encender();
        t.apagar();
    }
}
