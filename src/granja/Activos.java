package granja;

public abstract class Activos {

    private int codigo;
    private String nombreDescriptivo;

    public Activos(int codigo, String nombreDescriptivo) {
        this.codigo = codigo;
        this.nombreDescriptivo = nombreDescriptivo;
    }
}
