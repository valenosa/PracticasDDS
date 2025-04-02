package domain.entidades;

import java.util.HashSet;
import java.util.Set;

public class Inscripcion {
private Alumno alumno;
private Set<Materia> materiasPorCursar;
public Inscripcion(Alumno alumno) {
    this.alumno = alumno;
    this.materiasPorCursar = new HashSet<Materia>();
    }
public boolean aprobada(){
    return true;
}
}
