package examen_2023;

import java.time.LocalDate;

public class InstrumentoMusical extends JugueteDeMadera {

    private int edadMinima;

    public InstrumentoMusical(String nombre, String marca, String origen, int yearDeTala, int edadMinima) throws ExamenException {
        super(nombre, marca, origen, yearDeTala);
        setEdadMinima(edadMinima);
    }

    public int getEdadMinima() {
        return edadMinima;
    }

    public void setEdadMinima(int edadMinima) throws ExamenException {
        if (edadMinima <= 0) {
            throw new ExamenException("ERROR: La edad de mínima debe " + getNombre() + " debe ser mayor que cero");
        }
        this.edadMinima = edadMinima;
    }

    @Override
    public String toString() {
        return "InstrumentoMusical{" +
                "edadMinima=" + edadMinima +
                ", nombre='" + nombre + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
}
