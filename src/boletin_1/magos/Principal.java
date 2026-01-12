package boletin_1.magos;

import utils.MiEntradaSalida;

import java.util.Arrays;
import java.util.List;

public class Principal {

    private static final int MAX_CAPACIDAD_DE_PERSONAJES = 100;
    private static final Personaje[] LISTA_DE_PERSONAJES = new Personaje[MAX_CAPACIDAD_DE_PERSONAJES];

    public static void main(String[] args) {
/*
        Personaje mago1;
        Personaje mago2;
        Personaje clerigo1;

        try {
            mago1 = new Mago("Gandalf", Raza.HUMANO, 14, 20, 90);
            mago2 = new Mago("Sauron", Raza.ORCO, 13, 18, 100);
            clerigo1 = new Clerigo("saruman", Raza.HUMANO, 19, 15, 95, "Buda");
            simulacionCombate((Mago) mago1, (Mago) mago2, (Clerigo) clerigo1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
 */

        System.out.println("Bienvenido al juego de la magia!! A continuacion te mostramos las operaciones a realizar:");
        System.out.println(menu());

        boolean enFuncionamiento = true;

        while (enFuncionamiento) {
            int operacion = MiEntradaSalida.leerEntero("Introduce el número de la operacion que deseas realizar");
            switch (operacion) {
                case 1:
                    String pregunta = MiEntradaSalida.leerCadena("Desea crear un Mago o un Clérigo?");
                    if (pregunta.equalsIgnoreCase("Mago")) {
                        String nombre = MiEntradaSalida.leerCadena("Dime el nombre del mago");
                        String raza = MiEntradaSalida.leerCadena("Dime de que raza es el mago");
                    }
            }
        }
    }

    private static void construirMago(String nombre, Raza raza, int fuerza, int inteligencia, int puntosDeVidaMax) throws PersonajeException {
        if (haLlegadoAlLimite()) {
            throw new PersonajeException("ERROR: No puedes introducir otro personaje porque la lista está llena");
        }

        for (int i = 0; i < LISTA_DE_PERSONAJES.length; i++) {
            if (LISTA_DE_PERSONAJES[i] == null) {
                LISTA_DE_PERSONAJES[i] = new Mago(nombre, raza, fuerza, inteligencia, puntosDeVidaMax);
                break;
            }
        }
    }

    private static void construirCLerigo(String nombre, Raza raza, int fuerza, int inteligencia, int puntosDeVidaMax, String nombreDios) throws PersonajeException {
        if (haLlegadoAlLimite()) {
            throw new PersonajeException("ERROR: No puedes introducir otro personaje porque la lista está llena");
        }

        for (int i = 0; i < LISTA_DE_PERSONAJES.length; i++) {
            if (LISTA_DE_PERSONAJES[i] == null) {
                LISTA_DE_PERSONAJES[i] = new Clerigo(nombre, raza, fuerza, inteligencia, puntosDeVidaMax, nombreDios);
                break;
            }
        }
    }

    private static void addHechizoAMago(String nombreMago, String hechizo) throws PersonajeException {
        for (int i = 0; i < LISTA_DE_PERSONAJES.length; i++) {
            if (LISTA_DE_PERSONAJES[i] instanceof Mago) {
                if (LISTA_DE_PERSONAJES[i].getNombre().equalsIgnoreCase(nombreMago)) {
                    ((Mago) LISTA_DE_PERSONAJES[i]).aprendeHechizo(hechizo);
                    return;
                }
            }
        }
        throw new PersonajeException("Error: No se ha podido encontra al mago");
    }

    private static void magoLanzaHechizo(String nombreMago, String nombreObjetivo, String hechizo) throws PersonajeException {
        Mago mago = null;
        Personaje personajeObjetivo = null;

        if (nombreMago.equalsIgnoreCase(nombreObjetivo)) {
            throw new PersonajeException("Error: el mago no puede lanzarse el hechizo a sí mismo");
        }

        for (int i = 0; i < LISTA_DE_PERSONAJES.length; i++) {
            if (LISTA_DE_PERSONAJES[i] != null) {
                if (LISTA_DE_PERSONAJES[i].getNombre().equalsIgnoreCase(nombreMago)) {
                    mago = (Mago) LISTA_DE_PERSONAJES[i];
                    break;
                }
            }
        }

        for (int i = 0; i < LISTA_DE_PERSONAJES.length; i++) {
            if (LISTA_DE_PERSONAJES[i] != null) {
                if (LISTA_DE_PERSONAJES[i].getNombre().equalsIgnoreCase(nombreObjetivo)) {
                    personajeObjetivo = LISTA_DE_PERSONAJES[i];
                    break;
                }
            }
        }

        if (mago == null) {
            throw new PersonajeException("Error: No se ha podido encontra al mago");
        }

        if (personajeObjetivo == null) {
            throw new PersonajeException("Error: No se ha podido encontrar al personaje objetivo");
        }

        mago.lanzaHechizo(personajeObjetivo, hechizo);
    }

    private static void clericoCuraAMago(String nombreClerigoCurante, String nombreMagoACurar) throws PersonajeException {
        Clerigo clerigo = null;
        Mago mago = null;

        if (nombreClerigoCurante.equalsIgnoreCase(nombreMagoACurar)) {
            throw new PersonajeException("ERROR: Un clérigo no puede curarse a sí mismo");
        }

        for (int i = 0; i < LISTA_DE_PERSONAJES.length; i++) {
            if (LISTA_DE_PERSONAJES[i] != null && LISTA_DE_PERSONAJES[i] instanceof Clerigo && LISTA_DE_PERSONAJES[i].getNombre().equalsIgnoreCase(nombreClerigoCurante)) {
                clerigo = (Clerigo) LISTA_DE_PERSONAJES[i];
                break;
            }
        }

        for (int i = 0; i < LISTA_DE_PERSONAJES.length; i++) {
            if (LISTA_DE_PERSONAJES[i] != null && LISTA_DE_PERSONAJES[i] instanceof Mago && LISTA_DE_PERSONAJES[i].getNombre().equalsIgnoreCase(nombreMagoACurar)) {
                mago = (Mago) LISTA_DE_PERSONAJES[i];
                break;
            }
        }

        if (mago == null) {
            throw new PersonajeException("ERROR: no se ha encontrado al mago que se desa curar");
        }

        if (clerigo == null) {
            throw new PersonajeException("ERROR: no se ha encontrado al clérigo curante");
        }

        clerigo.curar(mago);
    }

    private static String lista() {
        return Arrays.toString(LISTA_DE_PERSONAJES);
    }

    private static boolean haLlegadoAlLimite() {
        return LISTA_DE_PERSONAJES[LISTA_DE_PERSONAJES.length - 1] != null;
    }

    private static String menu() {
        String menu =
                "1-Alta de personaje\n" +
                        "2-Mago aprende hechizo\n" +
                        "3-Mago lanza hechizo\n" +
                        "4-Clérigo cura a mago\n" +
                        "5-Mostrar el listado de personajes\n" +
                        "6-Mostrar el listado de personajes ordenados por puntos actuales de mayor a menor\n" +
                        "7-Salir";

        return menu;
    }

/*
    private static void simulacionCombate(Mago mago1, Mago mago2, Clerigo clerigo1) {
        System.out.println("Datos actuales de los personajes");
        System.out.println(mago1);
        System.out.println(mago2);
        System.out.println(clerigo1);

        System.out.println("Magos aprendiendo hechizos...");
        try {
            mago1.aprendeHechizo("kamehameha");
            mago1.aprendeHechizo("Super genkidama");
            mago2.aprendeHechizo("Resplandor final");
        } catch (PersonajeException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Hechizos aprendidos: ");
        System.out.println(mago1);
        System.out.println(mago2);

        System.out.println("El mago 1 lanza un hechizo sobre el mago 2");
        try {
            mago1.lanzaHechizo(mago2, "kamehameha");
        } catch (PersonajeException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("El mago 2 lanza un hechizo sobre el mago 1");
        try {
            mago2.lanzaHechizo(mago1, "Resplandor final");
        } catch (PersonajeException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("El clerigo cura al mago 2");
        try {
            clerigo1.curar(mago2);
        } catch (PersonajeException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("El mago 1 lanza un hechizo sobre el mago 2");
        try {
            mago1.lanzaHechizo(mago2, "super genkidama");
        } catch (PersonajeException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Imprimiendo datos resultantes del combate: ");
        System.out.println();
        System.out.println(mago1);
        System.out.println(mago2);
        System.out.println(clerigo1);
    }

 */
}
