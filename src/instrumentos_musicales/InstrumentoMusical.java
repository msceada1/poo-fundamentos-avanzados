package instrumentos_musicales;

public abstract class InstrumentoMusical implements Afinable, Tocable {

    private String nombre;
    Material material;
    Familia familia;
    boolean afinado;

    public InstrumentoMusical(String nombre, Material material, Familia familia, boolean afinado) {
        this.nombre = nombre;
        this.material = material;
        this.familia = familia;
        this.afinado = afinado;
    }

    public String getNombre() {
        return nombre;
    }

    public Material getMaterial() {
        return material;
    }

    public Familia getFamilia() {
        return familia;
    }

    public boolean isAfinado() {
        return afinado;
    }

    public void setAfinado(boolean afinado) {
        this.afinado = afinado;
    }
}
