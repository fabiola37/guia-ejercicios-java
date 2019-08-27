package Clases;

import java.util.ArrayList;
import java.util.List;

public class Empleado {
    private int dni;
    private String nombre;
    private String apellido;
    private String mail;
    private float sueldoBase;
    private float sueldo;
    private List<Empleado> empleados;

    public Empleado(int dni, String apellido, String nombre, String mail, float sueldoBase,float sueldo){
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.mail = mail;
        this.sueldoBase = sueldoBase;
        this.sueldo = sueldo;
        this.empleados = new ArrayList<>();
    }

    public void getSueldo(Empleado sueldoBase){

    }
    public List<Empleado> getEmpleados(){

        return empleados;
    }
    public void agregarEmpleado(empleados e1){
        empleados.add(e1);
    }
    public static void main(String[]args){
        Administrativo e1= new Administrativo(28866725,"Perez","Laura","lauraU@gmail.com",23000,13,26);
        Administrativo a1 = new Administrativo(23985784,"Garcia","Sandra","sandra23@hotmail.com",20000,10,22);
        Vendedor v1 = new Vendedor(23456987,"Lopez","Paula","pau@gmail.com",15000,29,34);
        Vendedor v2 = new Vendedor(34279876,"Sanchez","Adrian","adri@hotmail.com",22000,13,23);


    }


}
