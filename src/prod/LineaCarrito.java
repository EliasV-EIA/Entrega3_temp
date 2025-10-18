package prod;

public class LineaCarrito {
    private Producto producto;
    private int cantidad;
    private double subtotal;

    public LineaCarrito(Producto producto, int cantidad, double subtotal) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.subtotal = calcularSubtotal();
    }

    public double calcularSubtotal(){
        return this.producto.getPrecio()*cantidad;
    }
}
