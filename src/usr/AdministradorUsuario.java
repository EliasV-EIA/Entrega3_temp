package usr;

public class AdministradorUsuario extends Usuario{
    private int nivelAcceso;
    public AdministradorUsuario(String id, String nombre, String passwordHash, String rol, String fechaRegistro, String estadoCuenta, int nivelAcceso) {
        super(id, nombre, passwordHash, rol, fechaRegistro, estadoCuenta);
    }
}
