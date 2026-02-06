package examen_2023;

public abstract class JugueteDePlastico extends Juguete {

    private TipoDePlastico tipoDePlastico;

    public JugueteDePlastico(String nombre, String marca, TipoDePlastico tipoDePlastico) {
        super(nombre, marca);
        this.tipoDePlastico = tipoDePlastico;
    }

    public TipoDePlastico getTipoDePlastico() {
        return tipoDePlastico;
    }
}
