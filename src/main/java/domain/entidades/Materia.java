package domain.entidades;

import lombok.Getter;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Materia {
    @Getter private Set<Materia> materiasCorrelativas;

    public Materia() {
        this.materiasCorrelativas = new HashSet<Materia>();
    }

    public void agregarCorrelativas(Materia ... materias){
        Collections.addAll(this.materiasCorrelativas, materias);
    }

    private boolean cumpleLasCorrelatividades(Alumno alumno){
        //TODO
    //  return materiasCorrelativas.stream().allMatch(materia -> alumno.aprobo(materia));
        return materiasCorrelativas.stream().allMatch(materia -> alumno.aprobo(materia));
    }

    public boolean puedeCursar(Alumno alumno){
        //TODO
        return this.cumpleLasCorrelatividades(alumno);
    }
}
