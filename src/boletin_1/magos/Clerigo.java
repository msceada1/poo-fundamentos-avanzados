package boletin_1.magos;

public class Clerigo extends Personaje {

    private static final int CAPACIDAD_DE_CURACION = 10;
    private String dios;

    public Clerigo(String nombre, Raza raza, int fuerza, int inteligencia, int puntosDeVidaMax, String nombreDios) throws PersonajeException {
        super(nombre, raza, fuerza, inteligencia, puntosDeVidaMax);
        setDios(nombreDios);
    }

    @Override
    public void setFuerza(int fuerza) throws PersonajeException {
        if (fuerza < 18) {
            throw new PersonajeException("ERROR: La fuerza del clérigo no puede ser menor que 18");
        }
        super.setFuerza(fuerza);
    }

    @Override
    public void setInteligencia(int inteligencia) throws PersonajeException {
        if (inteligencia < 12 || inteligencia > 16) {
            throw new PersonajeException("ERROR: La inteligencia del clérigo debe estar entre 12 y 16");
        }
        super.setInteligencia(inteligencia);
    }

    public void setDios(String nombreDios) throws PersonajeException {
        if (nombreDios == null || nombreDios.isBlank()) {
            throw new PersonajeException("Error: El nombre del dios no puede ir vacío");
        }
        this.dios = nombreDios;
    }

    public String getDios() {
        return dios;
    }

    public void curar(Personaje personaje) throws PersonajeException {
        personaje.setPuntosDeVidaActuales(personaje.getPuntosDeVidaActuales() + CAPACIDAD_DE_CURACION);
    }

    @Override
    public String toString() {
        return super.toString() + "Clerigo{" +
                "dios='" + dios + '\'' +
                '}';
    }
}
