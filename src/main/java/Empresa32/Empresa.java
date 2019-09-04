package Empresa32;

import java.util.List;
import java.util.Objects;

public class Empresa {
    private String nombre;
    private String anioDeFuncion;
    protected List<Empleado> empleados;

    public Empresa(String nombre, String anioDeFuncion,List<Empleado> empleados) {
        this.nombre = nombre;
        this.anioDeFuncion = anioDeFuncion;
        this.empleados = empleados;
    }

    public String getNombre() {
        return nombre;
    }

    public String getAnioDeFuncion() {
        return anioDeFuncion;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Empresa{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", anioDeFuncion='").append(anioDeFuncion).append('\'');
        sb.append(", empleados=").append(empleados);
        sb.append('}');
        return sb.toString();
    }
    public void agregarEmpleado(Empleado empleado){
        empleados.add(empleado);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Empresa empresa = (Empresa) o;
        return Objects.equals(nombre, empresa.nombre) &&
                Objects.equals(anioDeFuncion, empresa.anioDeFuncion) &&
                Objects.equals(empleados, empresa.empleados);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, anioDeFuncion, empleados);
    }


}

