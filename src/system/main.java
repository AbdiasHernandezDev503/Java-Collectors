package system;

import system.models.Alumno;
import system.repository.AlumnoNoEncontradoException;
import system.repository.AlumnosImpl;
import system.repository.crudAlumno;

import java.util.Scanner;

public class main {
   public static crudAlumno crudAlumno = new AlumnosImpl();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
       do {
           System.out.println("\n1. Ingresar alumno");
           System.out.println("\n2. Buscar alumno");
           System.out.println("\n3. Eliminar alumno");
           System.out.println("\n4. Mostra todos los alumnos");
           System.out.println("\n5. Salir");
           System.out.println("\nSeleccione una opción: ");
           opcion = scanner.nextInt();
           scanner.nextLine();

           switch (opcion){
               case 1:
                   ingresar(scanner);
                   break;
               case 2:
                   buscar(scanner);
                   break;
               case 3:
                   eliminar(scanner);
                   break;
               case 4:
                   mostrarTodos();
                   break;

               case 5:
                   System.out.println("Saliendo del sistema...");
                   break;

               default:
                   System.out.println("Opción no valida");

           }
       } while (opcion != 5);
        scanner.close();
        System.out.println("Finalizado!");

    }

    private static void mostrarEnTabla(Alumno alumno) {
        System.out.println("Alumno encontrado:");

        System.out.println("+----------------+---------------------------+");
        System.out.println("|     Carnet     |       Nombre Completo      |");
        System.out.println("+----------------+---------------------------+");
        System.out.printf("| %-14s | %-25s |\n", alumno.getCarnet(), alumno.getNombreCompleto());
        System.out.println("+----------------+---------------------------+");
    }

    private static void mostrarTodos() {
        crudAlumno.mostarTodos();
    }

    private static void eliminar(Scanner scanner) {
        System.out.println("Ingrese el carnet que desea eliminar");
        String carnet = scanner.nextLine();
        try{
            crudAlumno.eliminar(carnet);
        }catch (AlumnoNoEncontradoException e){
            System.out.println(e.getMessage());
        }
    }

    private static void buscar(Scanner scanner) {
        System.out.println("Ingrese el carnet del alumno a bsucar");
        String carnet = scanner.nextLine();

        try {
            Alumno alumno = crudAlumno.buscar(carnet);
            mostrarEnTabla(alumno);
            //System.out.println("Alumno encontrado" + alumno);
        } catch (AlumnoNoEncontradoException e){
            System.out.println(e.getMessage());
        }
    }

    private static void ingresar(Scanner scanner) {
        System.out.println("Ingrese el carnet: ");
        String carnet = scanner.nextLine();
        System.out.println("Ingrese el nombre completo: ");
        String nombreCompleto = scanner.nextLine();


        crudAlumno.ingresar(carnet, nombreCompleto);
    }
}