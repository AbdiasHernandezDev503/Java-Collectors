package system.collectorsexample.collection;

import java.util.Collection;
import java.util.HashSet;

public class Empresa {
    private Collection<Empleado> empleados = new HashSet<>();

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
        System.out.println("Empleado: " + empleado.getNombre() + " " + empleado.getApellido() + " agregado correctamente");
    }

    // Método para mostrar todos los empleados
    public void mostrarEmpleados() {
        System.out.println("Se obtuvieron los siguientes resultados: ");
        for (Empleado empleado : empleados) {
            System.out.println(empleado);
        }
    }

    public static void main(String[] args) {
        Empresa empresa = new Empresa();

        // Agregar empleados
        empresa.agregarEmpleado(new Empleado("Juan", "Pérez"));
        empresa.agregarEmpleado(new Empleado("Ana", "Gómez"));
        empresa.agregarEmpleado(new Empleado("Luis", "Martínez"));
    }
}