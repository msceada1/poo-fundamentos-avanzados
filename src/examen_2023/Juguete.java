package examen_2023;

public abstract class Juguete {

    String nombre;
    String marca;

    public Juguete(String nombre, String marca) {
        this.nombre = nombre;
        this.marca = marca;
    }

    public String getNombre() {
        return nombre;
    }

    public String getMarca() {
        return marca;
    }
}
