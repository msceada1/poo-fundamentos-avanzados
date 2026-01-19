package boletin_interfaces.ejercicio_4;

public class Coche extends Vehiculo implements Cargable {


    public Coche(String nombre) throws VehiculoException {
        super(nombre);
    }

    @Override
    public void cargable() {
        System.out.println("Coche " + getNombre() + " cargando personas");
    }

    @Override
    public void descargable() {
        System.out.println("Coche " + getNombre() + " descargando personas");
    }
}
