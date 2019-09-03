package Empresa32;

import Supermercado31.Item;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.*;

public class EmpresaTest {
    private Empresa empresa1;
    private Empresa empresa2;
    private Empleado empleado1;
    private Empleado empleado2;
    private Empleado empleado3;

    @BeforeTest
    public void describe(){
        empresa1 = new Empresa("Sancor","1970",new ArrayList<>());
        empresa2 = new Empresa("Camel","1950",new ArrayList<>());
        empleado1 = new Empleado("Pablo","Perez","2/04/70","10/05/2010");
        empleado2 = new Empleado("Adrian","Lopez","14/09/80","2/08/98");
        empleado3 = new Empleado("Noelia","Garcia","23/5/86","23/07/2000");
    }
    @Test
    public void testAgregarEmpleado(){

        List<Empleado> esperado = new ArrayList<>();
        esperado.add(empleado1);
        esperado.add(empleado2);
        esperado.add(empleado3);

        empresa1.agregarEmpleado(empleado1);
        empresa2.agregarEmpleado(empleado2);
        empresa2.agregarEmpleado(empleado3);

        assertEquals(empresa1.getEmpleados(),esperado);
        assertEquals(empresa2.getEmpleados(),esperado);
        assertEquals(empresa2.getEmpleados(),esperado);
    }
    @Test
    public  List<Empleado> empleados() {
        System.out.println(empleados().stream());

    }

}