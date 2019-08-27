package Clases;

public class Vendedor extends Empleado {
    private int porcenComicion;
    private int totalDeVentas;
    public Vendedor(int dni,String nombre, String apellido,String mail,float sueldoBase,float sueldo,int porcenComicion, int totalDeVentas){
        super(dni ,nombre, apellido, mail,sueldoBase,sueldo);
        this.porcenComicion = porcenComicion;
        this.totalDeVentas = totalDeVentas;
    }

    public void getsueldo(Empleado sueldoBase){
      sueldoBase + (porcenComicion * totalDeVentas / 100);

    }
}
