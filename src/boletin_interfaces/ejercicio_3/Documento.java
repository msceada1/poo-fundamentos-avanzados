package boletin_interfaces.ejercicio_3;

public class Documento implements Enviable, Imprimible {

    @Override
    public void enviar() {
        System.out.println("Enviando documento...");
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimiendo documento...");
    }
}
