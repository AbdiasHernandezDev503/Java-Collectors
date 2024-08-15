package system.repository;

import system.models.Alumno;

import java.util.List;

public interface crudAlumno {
    void ingresar(String carnet, String nombreCompleto);
    Alumno buscar(String carnet) throws AlumnoNoEncontradoException;
    void eliminar(String carnet) throws AlumnoNoEncontradoException;
    List<String> mostarTodos();
}
