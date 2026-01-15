package examen_2024;

public class PokemonAgua extends Pokemon {

    public static final int MIN_RECUPERACION = 1;
    public static final int MAX_RECUPERACION = 2;

    private int puntosHidratacion;
    private double precisionPorLluvia;


    public PokemonAgua(String nombre, int ptsSalud, int nivelAtaque, int nivelDefensa, int ptsHidratacion) throws PokemonException {
        super(nombre, ptsSalud, nivelAtaque, nivelDefensa);
        setPtsHidratacion(ptsHidratacion);
    }

    public void setPtsHidratacion(int ptsHidratacion) {
        this.puntosHidratacion = ptsHidratacion;
    }

    public void setPrecisionPorLluvia() {
        if (WeatherCondition.LLUVIA) {
            this.precisionPorLluvia = super.getNivelAtaque() * Math.random() * 2;
        }
    }
}
