package examen_2023;

public class VehiculoPlastico extends JugueteDePlastico {


    private int numRuedas;


    public VehiculoPlastico(String nombre, String marca, int numRuedas) {
        super(nombre, marca, TipoDePlastico.PVC);
        this.numRuedas = numRuedas;
    }

    public int getNumRuedas() {
        return numRuedas;
    }

    public void setNumRuedas(int numRuedas) throws ExamenException {
        if (numRuedas <= 0) {
            throw new ExamenException("ERROR: El numero de ruedas de " + getNombre() + " debe ser mayor que cero");
        }
        this.numRuedas = numRuedas;
    }

    @Override
    public String toString() {
        return "VehiculoPlastico{" +
                "numRuedas=" + numRuedas +
                ", nombre='" + nombre + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
}
