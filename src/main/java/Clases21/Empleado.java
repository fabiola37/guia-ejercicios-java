package Clases21;

public abstract class Empleado {
    private int dni;
    private String nombre;
    private String apellido;
    private String mail;
    private float sueldoBase;

    public Empleado(int dni, String apellido, String nombre, String mail, float sueldoBase){
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.mail = mail;
        this.sueldoBase = sueldoBase;
    }

    public int getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getMail() {
        return mail;
    }

    public float getSueldoBase() {
        return sueldoBase;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Empleado{");
        sb.append("dni=").append(dni);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", apellido='").append(apellido).append('\'');
        sb.append(", mail='").append(mail).append('\'');
        sb.append(", sueldoBase=").append(sueldoBase);
        sb.append('}');
        return sb.toString();
    }

    public abstract float getSueldo();


}



