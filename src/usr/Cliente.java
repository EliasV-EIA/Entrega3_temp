package usr;

public class Cliente extends Usuario{
    private String direccionEnvio;
    private String telefono;
    private MetodoPago[] metodosPago = new MetodoPago[4];
    public Cliente(String id, String nombre, String passwordHash, String fechaRegistro, String estadoCuenta) {
        super(id, nombre, passwordHash, "Cliente", fechaRegistro, estadoCuenta);

    }

    public MetodoPago[] getMetodosPago() {
        return metodosPago;
    }

    public String getDireccionEnvio() {
        return direccionEnvio;
    }

    public void setDireccionEnvio(String direccionEnvio) {
        this.direccionEnvio = direccionEnvio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
