package domain.entidades;

import java.util.HashSet;
import java.util.Set;

public class Materia {
    private Set<Materia> materiasNecesarias;

    public Materia() {
        materiasNecesarias = new HashSet<Materia>();
    }

    private boolean cumpleLasCorrelatividades(Alumno alumno){
        return true;
    }

    public boolean puedeCursar(Alumno alumno){
        return true;
    }
}
