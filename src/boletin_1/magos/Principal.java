package boletin_1.magos;

public class Principal {
    public static void main(String[] args) {

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
    }

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
}
