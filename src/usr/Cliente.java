package usr;

public class Cliente extends Usuario{
    private String direccionEnvio;
    private String telefono;
    private MetodoPago[] metodosPago = new MetodoPago[4];
    public Cliente(String id, String nombre, String passwordHash, String fechaRegistro, String estadoCuenta) {
        super(id, nombre, passwordHash, "usr.Cliente", fechaRegistro, estadoCuenta);

    }

    public MetodoPago[] getMetodosPago() {
        return metodosPago;
    }
}
