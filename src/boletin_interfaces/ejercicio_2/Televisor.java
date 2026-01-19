package boletin_interfaces.ejercicio_2;

public class Televisor implements Encendible{

    @Override
    public void encender() {
        System.out.println("El televisor está encendido");
    }

    @Override
    public void apagar() {
        System.out.println("El televisor está apagado");
    }
}
