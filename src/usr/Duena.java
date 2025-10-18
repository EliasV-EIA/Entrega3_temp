package usr;

public class Duena extends Usuario {
    private String clave;
    private String coronacion;
    public Duena(String id, String nombre, String passwordHash, String rol, String fechaRegistro, String estadoCuenta, String clave, String coronacion) {
        super(id, nombre, passwordHash, rol, fechaRegistro, estadoCuenta);
        this.clave=clave;
        this.coronacion=coronacion;
    }
}
