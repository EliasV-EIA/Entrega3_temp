package prod;


public class Producto {
    private String id;
    private String nombre;
    private Categoria categoria;
    double precio;
    int stock;
    String fechaLanzamiento;

    public double getPrecio() {
        return precio;
    }
}
