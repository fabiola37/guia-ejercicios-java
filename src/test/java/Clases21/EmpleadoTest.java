package Clases21;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.LinkedList;
import java.util.List;

public class EmpleadoTest {

    private List<Empleado> empleados;

    @BeforeTest //es el describe de wollock
    public void setup(){
        empleados = new LinkedList<>();

         Empleado adm1 = new Administrativo(28866725,"Perez",
                 "Laura","lauraU@gmail.com",23000,13,26);
         Empleado adm2 = new Administrativo(23985784,"Garcia",
                 "Sandra","sandra23@hotmail.com",20000,10,22);
         Empleado ven1 = new Vendedor(23456987,"Lopez","Paula",
                "pau@gmail.com",15000,29,34);
         Empleado ven2 = new Vendedor(34279876,"Sanchez","Adrian",
                 "adri@hotmail.com",22000,13,23);

        empleados.add(adm1);
        empleados.add(adm2);
        empleados.add(ven1);
        empleados.add(ven2);
    }
    @Test
    public void test2(){
        for(Empleado e : empleados ){
            System.out.println(e.getSueldo());
        }
        empleados.stream().forEach(e -> System.out.println(e.getSueldo()));
    }







}