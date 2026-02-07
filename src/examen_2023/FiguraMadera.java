package examen_2023;

import java.time.LocalDate;

public class FiguraMadera extends JugueteDeMadera implements Apilable {

    private String color;
    private int numLados;

    public FiguraMadera(String nombre, String marca, String origen, int yearDeTala, String color, int numLados) {
        super(nombre, marca, origen, yearDeTala);
        this.color = color;
        this.numLados = numLados;
    }

    public String getColor() {
        return color;
    }

    public int getNumLados() {
        return numLados;
    }

    @Override
    public void apilar(Juguete juguete) throws ExamenException {
        if (!(juguete instanceof FiguraMadera)) {
            throw new ExamenException("no puedes apilar " + juguete.getNombre() + " porque su tipo no es compatible");
        }
    }

    public void setNumLados(int numLados) throws ExamenException {
        if (numLados <= 0) {
            throw new ExamenException("ERROR: El número de lados de " + getNombre() + " debe ser mayor que cero");
        }

        this.numLados = numLados;
    }

    @Override
    public String toString() {
        return "FiguraMadera{" +
                "color='" + color + '\'' +
                ", numLados=" + numLados +
                ", nombre='" + nombre + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
}
