package usr;

public abstract class Usuario {
    private String id;
    private String nombre;
    private String passwordHash;
    private String rol;
    private String fechaRegistro;
    private String estadoCuenta;

    public Usuario(String id, String nombre, String passwordHash, String rol, String fechaRegistro, String estadoCuenta) {
        this.id = id;
        this.nombre = nombre;
        this.passwordHash = passwordHash;
        this.rol = rol;
        this.fechaRegistro = fechaRegistro;
        this.estadoCuenta = estadoCuenta;
    }

    public String getEstadoCuenta() {
        return estadoCuenta;
    }

    public void setEstadoCuenta(String estadoCuenta) {
        this.estadoCuenta = estadoCuenta;
    }

    public String detalleUsuario(){
        return "ID: "+this.id+"\nNombre: "+this.nombre+"\nRol: "+rol+"\nFecha de Registro: "+this.fechaRegistro+"\nEstado de Cuenta: "+this.estadoCuenta;
    }

    public String getPasswordHash() {
        return passwordHash;
    }
}
