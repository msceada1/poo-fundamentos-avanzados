package boletin_1.magos;

import java.util.Arrays;

public class Mago extends Personaje {

    private static final int PUNTOS_DE_VIDA_A_QUITAR = -10;
    private String[] hechizos;

    public Mago(String nombre, Raza raza, int fuerza, int inteligencia, int puntosDeVidaMax) throws PersonajeException {
        super(nombre, raza, fuerza, inteligencia, puntosDeVidaMax);
        this.hechizos = new String[4];
    }

    @Override
    public void setInteligencia(int inteligencia) throws PersonajeException {
        if (inteligencia < 17) {
            throw new PersonajeException("ERROR: La inteligencia del mago no puede ser menor que 17");
        }
        super.setInteligencia(inteligencia);
    }

    @Override
    public void setFuerza(int fuerza) throws PersonajeException {
        if (fuerza > 15) {
            throw new PersonajeException("ERROR: La fuerza del mago no puede ser superior a 15");
        }
        super.setFuerza(fuerza);
    }

    public String[] getHechizos() {
        return new String[]{Arrays.toString(hechizos)};
    }

    public void aprendeHechizo(String hechizo) throws PersonajeException {
        for (int i = 0; i < hechizos.length; i++) {
            if (hechizos[i] == null) {
                hechizos[i] = hechizo;
                return;
            }
        }
        throw new PersonajeException("Error: El mago tiene su capacidad de hechizos al maximo");
    }

    public void lanzaHechizo(Personaje personaje, String hechizo) throws PersonajeException {
        borrarHechizo(hechizo);
        personaje.setPuntosDeVidaActuales(personaje.getPuntosDeVidaActuales() - PUNTOS_DE_VIDA_A_QUITAR);
    }

    private void borrarHechizo(String hechizo) throws PersonajeException {
        for (int i = 0; i < hechizos.length; i++) {
            if (hechizos[i].equalsIgnoreCase(hechizo)) {
                hechizos[i] = null;
                return;
            }
        }
        throw new PersonajeException("ERROR: Has gastado tus hechizos o el hechizo ya estaba gastado");
    }

    @Override
    public String toString() {
        return super.toString() + "\nMago{" +
                "hechizos=" + Arrays.toString(hechizos) +
                '}';
    }
}
