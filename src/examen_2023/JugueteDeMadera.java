package examen_2023;

import java.time.LocalDate;

public abstract class JugueteDeMadera extends Juguete {

    private String origen;
    private int yearDeTala;

    public JugueteDeMadera(String nombre, String marca, String origen, int yearDeTala) {
        super(nombre, marca);
        this.origen = origen;
        this.yearDeTala = yearDeTala;
    }

    public String getOrigen() {
        return origen;
    }

    public int getYearDeTala() {
        return yearDeTala;
    }
}
