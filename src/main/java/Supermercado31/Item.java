package Supermercado31;

public class Item {
    private String nombre;
    private int cantidad;
    private float precio;

    public Item(String nombre, int cantidad, float precio) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public String getNombre() {

        return nombre;
    }

    public int getCantidad() {

        return cantidad;
    }

    public float getPrecio() {

        return precio;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Item{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", cantidad=").append(cantidad);
        sb.append(", precio=").append(precio);
        sb.append('}');
        return sb.toString();
    }
}
