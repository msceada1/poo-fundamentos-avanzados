package examen_2023;

public class PiezaLego extends JugueteDePlastico implements Apilable {


    private int longitud;
    private String color;

    public PiezaLego(String nombre, String marca, int longitud, String color) {
        super(nombre, marca, TipoDePlastico.ABS);
        this.longitud = longitud;
        this.color = color;
    }

    public int getLongitud() {
        return longitud;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void apilar(Juguete juguete) throws ExamenException {
        if (!(juguete instanceof PiezaLego)) {
            throw new ExamenException("No puedes apilar " + juguete.getNombre() + " porque su tipo no es compatible");
        }
    }

    public void setLongitud(int longitud) throws ExamenException {
        if (longitud <= 0) {
            throw new ExamenException("error: La longitud debe ser mayor que cero");
        }

        this.longitud = longitud;
    }

    @Override
    public String toString() {
        return "PiezaLego{" +
                "longitud=" + longitud +
                ", color='" + color + '\'' +
                ", nombre='" + nombre + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
}
