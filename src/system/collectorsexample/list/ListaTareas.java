package system.collectorsexample.list;

import java.util.ArrayList;
import java.util.List;

public class ListaTareas {
    private List<String> tareas = new ArrayList<>();

    public void agregarTarea(String tarea) {
        tareas.add(tarea);
        System.out.println("Tarea: " + tarea + " ha sido agregada con exito");
    }

    public String obtenerTarea(int indice) {
        if (indice >= 0 && indice < tareas.size()) {
            System.out.println("\n *********************** OBTENER TAREA ESPECIFICA **************************** \n");
            return tareas.get(indice);
        } else {
            return "Índice fuera de rango";
        }
    }

    public void eliminarTarea(int indice) {
        System.out.println("\n *********************** ELIMINAR DE LA LISTA DE TAREAS **************************** \n");
        if (indice >= 0 && indice < tareas.size()) {
            tareas.remove(indice);
            System.out.println("Se eliminó la tarea: " + tareas.get(indice));
        } else {
            System.out.println("Índice fuera de rango");
        }
    }

    public void mostrarTareas() {
        System.out.println("\n *********************** MOSTRAR TAREAS **************************** \n");
        System.out.println("Listado de Tareas: ");
        for (int i = 0; i < tareas.size(); i++) {
            System.out.println((i + 1) + ". " + tareas.get(i));
        }
    }


}
