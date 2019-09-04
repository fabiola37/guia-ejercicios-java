package Empresa32;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

import static org.testng.Assert.*;

public class EmpresaTest {
    private Empresa empresa1;
    private Empresa empresa2;
    private Empleado empleado1;
    private Empleado empleado2;
    private Empleado empleado3;
    private List<Empresa> empresas;


    @BeforeTest
    public void describe(){
        empresa1 = new Empresa("Sancor","1970",new ArrayList<>());
        empresa2 = new Empresa("Camel","1950",new ArrayList<>());
        empleado1 = new Empleado("Pablo","Perez","2/04/70","10/05/2010");
        empleado2 = new Empleado("Adrian","Lopez","14/09/80","2/08/98");
        empleado3 = new Empleado("Noelia","Garcia","23/5/86","23/07/2000");

        empresas = new ArrayList<Empresa>();

    }
    @Test
    public void testAgregarEmpresa(){
        empresas.add(empresa1);
        empresas.add(empresa2);

        assertTrue(empresas.contains(empresa1));
    }
    @Test
    public void testAgregarEmpleado(){

        empresa1.agregarEmpleado(empleado1);
        empresa2.agregarEmpleado(empleado2);
        empresa2.agregarEmpleado(empleado3);

        assertEquals(Arrays.asList(empleado1) ,empresa1.getEmpleados());
        assertEquals(Arrays.asList((empleado2),(empleado3)),empresa2.getEmpleados());

    }
    @Test
    public void testListadoDeEmpresas(){

       empresas.add(empresa1);
       empresas.add(empresa2);

       assertEquals(Arrays.asList((empresa1),(empresa2)),empresas.get());

    }



}