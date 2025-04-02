package domain.entidades;

import java.util.HashSet;
import java.util.Set;

public class Alumno {
    private Set<Materia> materiasAprobadas;

    public Alumno() {
        materiasAprobadas = new HashSet<Materia>();
    }

    public boolean puedeInscribirse(Set<Materia> materiasPorCursar) {
        return true;
    }

    public boolean aprobo(Materia materia){
        return true;
    }
}
