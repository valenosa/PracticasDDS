package domain.entidades;

import java.util.HashSet;
import java.util.Set;

public class Materia {
    private Set<Materia> materiasNecesarias;

    public Materia(Set<Materia> materias) {
        materiasNecesarias = new HashSet<Materia>();
        this.materiasNecesarias.addAll(materias);
    }

    private boolean cumpleLasCorrelatividades(Alumno alumno){
        return true;
    }

    public boolean puedeCursar(Alumno alumno){
        return true;
    }
}
