package system.repository;

import system.models.Alumno;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AlumnosImpl implements crudAlumno{

    private Map<String, Alumno> alumnos = new HashMap<>();

    @Override
    public void ingresar(String carnet, String nombreCompleto) {
     Alumno alumno = new Alumno(carnet, nombreCompleto);
     alumnos.put(carnet, alumno);
        System.out.println("Alumno ingresado exitosamente");
    }

    @Override
    public Alumno buscar(String carnet) throws AlumnoNoEncontradoException {
        Alumno alumno = alumnos.get(carnet);
        if (alumno == null){
            throw  new AlumnoNoEncontradoException("Alumno no encontrado, no se encontro su Carnet");

        }
        return alumno;
    }



    @Override
    public void eliminar(String carnet) throws AlumnoNoEncontradoException {
        if (alumnos.remove(carnet) == null){
            throw new AlumnoNoEncontradoException("Carnet de Alumno no encontrado, no se puede eliminar");
        }
        System.out.println("Alumnos eliminado exitosamente.");

    }

    @Override
    public List<String> mostarTodos() {
        List<String> nombres = new ArrayList<>();
        if (alumnos.isEmpty()){
            System.out.println("No hay alumnos ingresados");
        } else {
            System.out.println("Listado de todos los alumnos:");
            for (Alumno alumno : alumnos.values()){
                System.out.println(alumno);
            }
        }
       return nombres;
    }
}
