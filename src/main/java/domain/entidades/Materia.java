package domain.entidades;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Materia {
    private Set<Materia> materiasCorrelativas;

    public Materia() {
        this.materiasCorrelativas = new HashSet<Materia>();
    }

    public void agregarCorrelativas(Materia ... materias){
        Collections.addAll(this.materiasCorrelativas, materias);
    }

    private boolean cumpleLasCorrelatividades(Alumno alumno){
        //TODO
        return false;
    }

    public boolean puedeCursar(Alumno alumno){
        //TODO
        return this.cumpleLasCorrelatividades(alumno);
    }
}
