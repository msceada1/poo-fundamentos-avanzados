package examen_2024;

import utils.MiEntradaSalida;

public class PokemonAgua extends Pokemon {

    public static final int MIN_RECUPERACION = 1;
    public static final int MAX_RECUPERACION = 2;

    private int puntosHidratacion;


    public PokemonAgua(String nombre, int ptsSalud, int nivelAtaque, int nivelDefensa, int ptsHidratacion) throws PokemonException {
        super(nombre, ptsSalud, nivelAtaque, nivelDefensa);
        setPtsHidratacion(ptsHidratacion);
    }

    public void setPtsHidratacion(int ptsHidratacion) {
        this.ptsHidratacion = ptsHidratacion;
    }

    public void precisionPorLluvia() {
        if (WeatherCondition.LLUVIA) {
            super.setNivelAtauqe(super.getNivelAtauqe() += MiEntradaSalida.generaAleatorioEntre(MIN_RECUPERACION, MAX_RECUPERACION, false));
        }
    }
}
