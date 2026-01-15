package examen_2024;

public abstract class Pokemon {

    public static final int MIN_VIDA = 0;
    public static final int MAX_VIDA = 100;
    public static final int MIN_NIVEL_ATAQUE = 5;
    public static final int MAX_NIVEL_ATAQUE = 15;
    public static final int MIN_NIVEL_DEFENSA = 5;
    public static final int MAX_NIVEL_DEFENSA = 25;

    private String nombre;
    private double puntosDeSalud;
    private double nivelAtauqe;
    private double nivelDefensa;

    public Pokemon(String nombre, int puntosDeSalud, int nivelAtaque, int nivelDefensa) throws PokemonException {
        setNombre(nombre);
        setPuntosDeSalud(puntosDeSalud);
        setNivelAtauqe(nivelAtaque);
        setNivelDefensa(nivelDefensa);
    }

    public void setNombre(String nombre) throws PokemonException {
        if (nombre.isBlank()) {
            throw new PokemonException("Error: el nombre debe tener texto");
        }

        this.nombre = nombre;
    }

    public void setPuntosDeSalud(int puntosDeSalud) throws PokemonException {
        if (puntosDeSalud < MIN_VIDA || puntosDeSalud > MAX_VIDA) {
            throw new PokemonException("ERROR: La vida debe estar entre 0 y 100");
        }

        this.puntosDeSalud = puntosDeSalud;
    }

    public void setNivelAtauqe(int nivelAtauqe) throws PokemonException {
        if (nivelAtauqe < MIN_NIVEL_ATAQUE || nivelAtauqe > MAX_NIVEL_ATAQUE) {
            throw new PokemonException("ERROR: el nivel de ataque debe estar entre 5 y 15");
        }

        this.nivelAtauqe = nivelAtauqe;
    }

    public void setNivelDefensa(int nivelDefensa) throws PokemonException {
        if (nivelDefensa < MIN_NIVEL_DEFENSA || nivelAtauqe > MAX_NIVEL_DEFENSA) {
            throw new PokemonException("ERROR: el nivel de defensa debe estar entre 5 y 25");
        }

        this.nivelDefensa = nivelDefensa;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPuntosDeSalud() {
        return puntosDeSalud;
    }

    public double getNivelAtauqe() {
        return nivelAtauqe;
    }

    public double getNivelDefensa() {
        return nivelDefensa;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "nombre='" + nombre + '\'' +
                ", ptsSalud=" + puntosDeSalud +
                ", nivelAtauqe=" + nivelAtauqe +
                ", nivelDefensa=" + nivelDefensa +
                '}';
    }
}
