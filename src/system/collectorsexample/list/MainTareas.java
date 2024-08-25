package system.collectorsexample.list;

public class MainTareas {
    public static void main(String[] args) {
        ListaTareas listaDeTareas = new ListaTareas();

        System.out.println("*********************** AGREGAR TAREAS A LA LISTA **************************** \n");

        listaDeTareas.agregarTarea("Comprar leche");
        listaDeTareas.agregarTarea("Llamar al banco");
        listaDeTareas.agregarTarea("Enviar correo electrónico");

        listaDeTareas.mostrarTareas();

        System.out.println("Tarea en el índice 2: " + listaDeTareas.obtenerTarea(1));

        listaDeTareas.eliminarTarea(0);

        listaDeTareas.mostrarTareas();
    }
}
