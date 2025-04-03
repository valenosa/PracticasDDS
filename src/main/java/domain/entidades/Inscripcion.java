package domain.entidades;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Inscripcion {
    private Alumno alumno;
    private Set<Materia> materiasPorCursar;

    public Inscripcion(Alumno alumno) {
        this.alumno = alumno;
        this.materiasPorCursar = new HashSet<Materia>();
    }

    public void agregarMaterias(Materia ... materias){
        Collections.addAll(this.materiasPorCursar, materias);
    }

    public boolean aprobada(){
        //TODO
        return false;
    }
}
