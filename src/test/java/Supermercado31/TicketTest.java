package Supermercado31;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.Arrays;
import java.util.Date;
import java.util.List;


import static org.testng.Assert.*;

public class TicketTest {
    private Ticket ticket;

    @BeforeMethod
    public void setUp() {
        ticket = new Ticket(1,new Date());
    }
    @Test
    public void testAgregarItem()  {
        Item item = new Item("Coca",1,100);
        ticket.agregarItem(item);

        assertTrue(ticket.contieneItem(item));
    }
    @Test
    public void testRemoverItem() throws Exception {
        Item item = new Item("Coca",1,100);
        ticket.agregarItem(item);

        ticket.removerItem(item);

        assertFalse(ticket.contieneItem(item));
    }

    @Test
    public void testBuscarPorProducto() {
        Item item = new Item("Coca Botella", 1, 100);
        Item item2 = new Item("Coca Lata", 2, 50);
        Item item3 = new Item("Fideos", 1, 80);

        ticket.agregarItem(item);
        ticket.agregarItem(item2);
        ticket.agregarItem(item3);

        List<Item> items = ticket.buscarProducto("Coca");

        List<Item> itemsEsperados = Arrays.asList(item, item2);

        assertEquals(items, itemsEsperados);
    }
    @Test
    public void getProductos(){
        for(Ticket i : ticket ){
            System.out.println(i.getId());
        }
        ticket.stream().map(i ->i.getNombre()).
                forEach(i -> System.out.println("Item : "+ i));

    }


}