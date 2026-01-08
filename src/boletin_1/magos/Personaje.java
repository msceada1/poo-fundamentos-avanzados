package boletin_1.magos;

public abstract class Personaje {

    private String nombre;
    private Raza raza;
    private int fuerza;
    private int inteligencia;
    private int puntosDeVidaMax;
    private int puntosDeVidaActuales;

    public Personaje(String nombre, String raza, int fuerza, int inteligencia, int puntosDeVidaMax, int puntosDeVidaActuales) throws MagoException {
        this.nombre = nombre;
        //setRaza(raza);
        setFuerza(fuerza);
        setInteligencia(inteligencia);
        setPuntosDeVidaMax(puntosDeVidaMax);
        setPuntosDeVidaActuales(puntosDeVidaActuales);
    }

    public void setFuerza(int fuerza) throws MagoException {
        if (fuerza < 0 || fuerza > 20) {
            throw new MagoException("ERROR: La fuerza debe estar entre 0 y 20");
        }
        this.fuerza = fuerza;
    }

    public void setInteligencia(int inteligencia) throws MagoException {
        if (inteligencia < 0 || inteligencia > 20) {
            throw new MagoException("ERROR: La fuerza debe estar entre 0 y 20");
        }
        this.inteligencia = inteligencia;
    }

    public void setPuntosDeVidaMax(int puntosDeVidaMax) throws MagoException {
        if (puntosDeVidaMax < 0 || puntosDeVidaMax > 100) {
            throw new MagoException("ERROR: Los puntos de vida deben estar entre 0 y 100");
        }
    }

    public void setPuntosDeVidaActuales(int puntosDeVidaActuales) throws MagoException {
        if (puntosDeVidaActuales < 0 || puntosDeVidaActuales > this.puntosDeVidaActuales) {
            throw new MagoException("ERROR: La vida debe estar entre 0 y el máximo de capacidad de vida");
        }
        this.puntosDeVidaActuales = puntosDeVidaActuales;
    }

    public void setRaza(Raza raza) {

    }
}
