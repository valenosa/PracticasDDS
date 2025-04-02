package domain.entidades;

import java.util.HashSet;
import java.util.Set;

public class Inscripcion {
private Alumno alumno;
private Set<Materia> materiasPorCursar;
public Inscripcion(Alumno alumno, Set<Materia> materias) {
    this.alumno = alumno;
    this.materiasPorCursar = new HashSet<Materia>();
    this.materiasPorCursar.addAll(materias);
    }
public boolean aprobada(){
    return true;
}
}
