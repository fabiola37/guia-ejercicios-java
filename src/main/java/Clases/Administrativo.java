package Clases;

public class Administrativo extends Empleado {
    private int hsExtras;
    private int hsMes;

    public Administrativo(int dni,String nombre, String apellido,String mail,float sueldoBase,float sueldo, int hsExtras, int hsMes){
        super(dni ,nombre, apellido, mail,sueldoBase,sueldo);
        this.hsExtras = hsExtras;
        this.hsMes = hsMes;

    }
    @Override
    public void getsueldo(Empleado sueldoBase){

        sueldoBase * ((hsExtras *1.5) + hsMes) /hsMes;
    }
}
