package domain.entidades;

import java.util.ArrayList;
import java.util.List;

public class Inscripcion {
private Alumno alumno;
private List<Materia> materiasPorCursar;
public Inscripcion(Alumno alumno) {
    this.alumno = alumno;
    this.materiasPorCursar = new ArrayList<Materia>();
    }
public boolean aprobada(){
    return true;
}
}
