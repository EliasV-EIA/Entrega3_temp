package usr;

public class MetodoPago {
    private String id;
    private String tipo;
    private String titular;
    private String numeroEnmascarado;

    public MetodoPago(String id, String tipo, String titular, String numeroEnmascarado) {
        this.id = id;
        this.tipo = tipo;
        this.titular = titular;
        this.numeroEnmascarado = numeroEnmascarado;
    }

    public String getNumeroEnmascarado() {
        return numeroEnmascarado;
    }
}
