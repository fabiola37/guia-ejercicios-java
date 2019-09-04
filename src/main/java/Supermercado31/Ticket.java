package Supermercado31;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class Ticket {
    private String id;
    private Date fecha;
    private List <Item> items;

    public Ticket(String id, Date fecha) {
        this.id = id;
        this.fecha = fecha;
        this.items = new ArrayList<>();

    }

    public String getId() {

        return id;
    }

    public Date getFecha() {

        return fecha;
    }
    public List<Item> getItems() {

        return items;
    }
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Ticket{");
        sb.append("id='").append(id).append('\'');
        sb.append(", fecha=").append(fecha);
        sb.append(", items=").append(items);
        sb.append('}');
        return sb.toString();
    }
    public void agregarItem(Item item){

        items.add(item);
    }

    public void removerItem(Item item){

        items.remove(item);
    }
    public boolean contieneItem(Item item){

        return items.contains(item);

    }

    public List<Item> buscarProducto(String producto) {
        return items.stream().filter(i -> i.getNombre().contains(producto))
                .collect(Collectors.toList());

    }
}
