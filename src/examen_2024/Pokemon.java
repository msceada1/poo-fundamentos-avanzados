package examen_2024;

public abstract class Pokemon {

    private static final int MIN_SALUD = 0;
    private static final int MAX_SALUD = 100;
    private static final int MIN_ATAQUE = 5;
    private static final int MAX_ATAQUE = 15;
    private static final int MIN_DEFENSA = 5;
    private static final int MAX_DEFENSA = 25;

    private String nombre;
    private int puntosSalud;
    private int puntosAtaque;
    private int puntosDefensa;

    public Pokemon(String nombre, int puntosSalud, int puntosAtaque, int puntosDefensa) throws RoundStartException {
        setNombre(nombre);
        setPuntosSalud(puntosSalud);
        setPuntosAtaque(puntosAtaque);
        setPuntosDefensa(puntosDefensa);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws RoundStartException {
        if (nombre == null || nombre.isBlank()) {
            throw new RoundStartException("ERROR: El pokemon debe poseer nombre");
        }
        this.nombre = nombre;
    }

    public int getPuntosDefensa() {
        return puntosDefensa;
    }

    public void setPuntosDefensa(int puntosDefensa) throws RoundStartException {
        if (puntosDefensa < MIN_DEFENSA || puntosDefensa > MAX_DEFENSA) {
            throw new RoundStartException("ERROR: La defensa del pokemon debe estar entre " + MIN_DEFENSA + " y " + MAX_DEFENSA);
        }
        this.puntosDefensa = puntosDefensa;
    }

    public int getPuntosAtaque() {
        return puntosAtaque;
    }

    public void setPuntosAtaque(int puntosAtaque) throws RoundStartException {
        if (puntosAtaque < MIN_ATAQUE || puntosAtaque > MAX_ATAQUE) {
            throw new RoundStartException("ERROR: El ataque del pokemon debe estar entre " + MIN_ATAQUE + " y " + MAX_ATAQUE);
        }
        this.puntosAtaque = puntosAtaque;
    }

    public int getPuntosSalud() {
        return puntosSalud;
    }

    public void setPuntosSalud(int puntosSalud) throws RoundStartException {
        if (puntosSalud < MIN_SALUD || puntosSalud > MAX_SALUD) {
            throw new RoundStartException("ERROR: La salud del pokemon debe estar entre " + MIN_SALUD + " y " + MAX_SALUD);
        }
        this.puntosSalud = puntosSalud;
    }

    public abstract void roundStart(WeatherCondition weatherCondition) throws RoundStartException;
}
