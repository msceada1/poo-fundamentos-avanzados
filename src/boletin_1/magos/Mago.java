package boletin_1.magos;

public class Mago extends Personaje {

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

    public void aprenderHechizo(String hechizo) throws PersonajeException {
        for (int i = 0; i < hechizos.length; i++) {
            if (hechizos[i] == null) {
                hechizos[i] = hechizo;
                break;
            }
        }
        throw new PersonajeException("Error: El mago tiene su capacidad de hechizos al maximo");
    }
}
