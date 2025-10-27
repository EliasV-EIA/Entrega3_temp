package prod;

import java.util.ArrayList;

public class Carrito
{
    private String id;
    private ArrayList<LineaCarrito> linea = new ArrayList<>();
    private String fecha;

    public Carrito(){
        this.id="n";
        this.fecha="n";
    }
    public Carrito(String id, String fecha){
        this.id= id;
        this.fecha= fecha;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public ArrayList<LineaCarrito> getLinea() {
        return linea;
    }

    public void setLinea(ArrayList<LineaCarrito> linea) {
        this.linea = linea;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
