package examen_2024;

public class PokemonAgua extends Pokemon {

    private int valorHidratacion;
    private int precisionPorLluvia;

    public PokemonAgua(String nombre, int puntosSalud, int puntosAtaque, int puntosDefensa, int valorHidratacion) throws RoundStartException {
        super(nombre, puntosSalud, puntosAtaque, puntosDefensa);
        this.valorHidratacion = valorHidratacion;
        this.precisionPorLluvia = precisionPorLluvia;
    }


    @Override
    public void roundStart(WeatherCondition weatherCondition) throws RoundStartException {
        if (weatherCondition == WeatherCondition.LLUVIA) {
            precisionPorLluvia = (int) (getPuntosAtaque() * Math.random() * 2);
            setPuntosAtaque(precisionPorLluvia);
        }
    }
}
