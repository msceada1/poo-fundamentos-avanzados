package boletin_interfaces.ejercicio_1;

public class Persona implements Saludador {

    @Override
    public void saludar() {
        System.out.println("Hola, soy una persona");
    }
}
