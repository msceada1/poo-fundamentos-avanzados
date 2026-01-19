package boletin_interfaces.ejercicio_4;

public class Autobus extends Vehiculo implements Cargable {


    public Autobus(String nombre) throws VehiculoException {
        super(nombre);
    }

    @Override
    public void cargable() {
        System.out.println("Autobús " + getNombre() + " cargando personas");
    }

    @Override
    public void descargable() {
        System.out.println("Autobús " + getNombre() + " descargando personas");
    }
}
