package domain.entidades;

import java.util.HashSet;
import java.util.Set;

public class Alumno {
    private Set<Materia> materiasAprobadas;

    public Alumno(Set<Materia> materias) {
        materiasAprobadas = new HashSet<Materia>();
        this.materiasAprobadas.addAll(materias);
    }

    public boolean puedeInscribirse(Set<Materia> materiasPorCursar) {
        return true;
    }

    public boolean aprobo(Materia materia){
        return true;
    }
}
