package instrumentos_musicales;

public class GuitarraAcustica extends InstrumentoMusical implements Tocable, Portable {

    private int peso;

    public GuitarraAcustica(String nombre, Material material, Familia familia, boolean afinado, int peso) {
        super(nombre, material, familia, afinado);
        this.peso = peso;
    }

    @Override
    public void afinar() {
        if (!this.afinado) {
            System.out.println("Afinando el instrumento " + getNombre());
            setAfinado(true);
        }
    }

    @Override
    public void faciidadTransporte(int peso) {
        if (peso <= 3) {
            System.out.println("El instrumento " + getNombre() + " es fácil de transportar");
        } else {
            System.out.println("El instrumento " + getNombre() + " no es fácil de transportar");
        }
    }

    @Override
    public void tocar() {
        System.out.println("Tocando el instrumento " + getNombre());
    }
}
