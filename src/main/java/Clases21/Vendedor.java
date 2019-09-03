package Clases21;

public class Vendedor extends Empleado {
    private int porcenComicion;
    private int totalDeVentas;

    public Vendedor(int dni,String nombre, String apellido,String mail,float sueldoBase,int porcenComicion, int totalDeVentas){
        super(dni ,nombre, apellido, mail,sueldoBase);
        this.porcenComicion = porcenComicion;
        this.totalDeVentas = totalDeVentas;
    }

    public int getPorcenComicion() {
        return porcenComicion;
    }

    public int getTotalDeVentas() {
        return totalDeVentas;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Vendedor{");
        sb.append("porcenComicion=").append(porcenComicion);
        sb.append(", totalDeVentas=").append(totalDeVentas);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public float getSueldo() {
        return getSueldoBase()+ porcenComicion * totalDeVentas/100;
    }




}
