package boletin_1.magos;

public abstract class Personaje {

    private String nombre;
    private Raza raza;
    private int fuerza;
    private int inteligencia;
    private int puntosDeVidaMax;
    private int puntosDeVidaActuales;

    public Personaje(String nombre, Raza raza, int fuerza, int inteligencia, int puntosDeVidaMax) throws PersonajeException {
        setNombre(nombre);
        setRaza(raza);
        setFuerza(fuerza);
        setInteligencia(inteligencia);
        setPuntosDeVidaMax(puntosDeVidaMax);
        setPuntosDeVidaActuales(puntosDeVidaMax);
    }

    public void setNombre(String nombre) throws PersonajeException {
        if (nombre == null || nombre.isBlank()) {
            throw new PersonajeException("ERROR: El personaje debe tener nombre");
        }
        this.nombre = nombre;
    }

    public void setFuerza(int fuerza) throws PersonajeException {
        if (fuerza < 0 || fuerza > 20) {
            throw new PersonajeException("ERROR: La fuerza debe estar entre 0 y 20");
        }
        this.fuerza = fuerza;
    }

    public void setInteligencia(int inteligencia) throws PersonajeException {
        if (inteligencia < 0 || inteligencia > 20) {
            throw new PersonajeException("ERROR: La inteligencia debe estar entre 0 y 20");
        }
        this.inteligencia = inteligencia;
    }

    public void setPuntosDeVidaMax(int puntosDeVidaMax) throws PersonajeException {
        if (puntosDeVidaMax < 0 || puntosDeVidaMax > 100) {
            throw new PersonajeException("ERROR: Los puntos de vida deben estar entre 0 y 100");
        }
        this.puntosDeVidaMax = puntosDeVidaMax;
    }

    public void setPuntosDeVidaActuales(int puntosDeVidaActuales) throws PersonajeException {
        if (puntosDeVidaActuales < 0 || puntosDeVidaActuales > this.puntosDeVidaMax) {
            throw new PersonajeException("ERROR: La vida debe estar entre 0 y el máximo de capacidad de vida");
        }
        this.puntosDeVidaActuales = puntosDeVidaActuales;
    }

    public void setRaza(Raza raza) throws PersonajeException {
        if (raza == null) {
            throw new PersonajeException("ERROR: La raza no puede ser nula");
        }
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public Raza getRaza() {
        return raza;
    }

    public int getFuerza() {
        return fuerza;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public int getPuntosDeVidaMax() {
        return puntosDeVidaMax;
    }

    public int getPuntosDeVidaActuales() {
        return puntosDeVidaActuales;
    }

    @Override
    public String toString() {
        return "Personaje{" +
                "nombre='" + nombre + '\'' +
                ", raza=" + raza +
                ", fuerza=" + fuerza +
                ", inteligencia=" + inteligencia +
                ", puntosDeVidaMax=" + puntosDeVidaMax +
                ", puntosDeVidaActuales=" + puntosDeVidaActuales +
                '}';
    }
}
