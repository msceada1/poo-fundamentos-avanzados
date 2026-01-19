package boletin_interfaces.ejercicio_4;

public abstract class Vehiculo implements Movible {

    private String nombre;

    public Vehiculo(String nombre) throws VehiculoException {
        setNombre(nombre);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws VehiculoException {
        if (nombre.isBlank()) {
            throw new VehiculoException("ERROR: El vehículo debe poseer nombre");
        }
    }

    @Override
    public void acelerar() {
        System.out.println("Vehículo " + getNombre() + " acelerando");
    }

    @Override
    public void frenar() {
        System.out.println("Vehiculo " + getNombre() + " frenando");
    }
}
