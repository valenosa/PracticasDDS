package domain.entidades;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Alumno {
    private Set<Materia> materiasAprobadas;

    public Alumno() {
        this.materiasAprobadas = new HashSet<Materia>();
    }

    public void agregarAprobadas(Materia ... materias){
        Collections.addAll(this.materiasAprobadas, materias);
    }

    public boolean puedeInscribirse(Set<Materia> materiasPorCursar) {
        //TODO
        return materiasPorCursar.stream().allMatch(materia -> materia.puedeCursar(this));
    }

    public boolean aprobo(Materia materia){
        //TODO
        return false;
    }
}
