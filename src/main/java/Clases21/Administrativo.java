package Clases21;

public class Administrativo extends Empleado {
    private int hsExtras;
    private int hsMes;

    public Administrativo(int dni, String nombre, String apellido, String mail, float sueldoBase, int hsExtras, int hsMes) {
        super(dni, nombre, apellido, mail, sueldoBase);
        this.hsExtras = hsExtras;
        this.hsMes = hsMes;

    }

    public int getHsExtras() {
        return hsExtras;
    }

    public int getHsMes() {
        return hsMes;
    }

    @Override
    public float getSueldo() {

        return getSueldoBase()*(hsExtras * 1.5f + hsMes)/hsMes;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Administrativo{");
        sb.append("hsExtras=").append(hsExtras);
        sb.append(", hsMes=").append(hsMes);
        sb.append('}');
        return sb.toString();
    }
}
