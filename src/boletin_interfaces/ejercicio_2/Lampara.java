package boletin_interfaces.ejercicio_2;

public class Lampara implements Encendible {

    @Override
    public void encender() {
        System.out.println("La lampara está encendida");
    }

    @Override
    public void apagar() {
        System.out.println("La lampara está apagada");
    }
}
