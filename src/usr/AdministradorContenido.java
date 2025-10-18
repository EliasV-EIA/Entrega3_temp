package usr;

import java.util.HashSet;

public class AdministradorContenido extends Usuario{
    private HashSet<String> permisosDeEdicion = new HashSet<String>();
    public AdministradorContenido(String id, String nombre_usuario, String passwordHash, String rol, String fechaRegistro, String estadoCuenta,boolean nombre,boolean categoria, boolean descripcion,boolean precio, boolean stock, boolean fecha ){
        super(id,nombre_usuario, passwordHash,rol,fechaRegistro,estadoCuenta);
        if (nombre)
            this.permisosDeEdicion.add("nombre");
        if (categoria)
            this.permisosDeEdicion.add("categoria");
        if (descripcion)
            this.permisosDeEdicion.add("descripcion");
        if (precio)
            this.permisosDeEdicion.add("precio");
        if (stock)
            this.permisosDeEdicion.add("stock");
        if (fecha)
            this.permisosDeEdicion.add("fecha");
    }
    public HashSet<String> getPermisosDeEdicion() {
        return permisosDeEdicion;
    }
}
