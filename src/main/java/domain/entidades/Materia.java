package domain.entidades;

import lombok.Getter;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@Getter
public class Materia {
    private final Set<Materia> materiasCorrelativas;

    public Materia() {
        this.materiasCorrelativas = new HashSet<>();
    }

    public void agregarCorrelativas(Materia ... materias){
        Collections.addAll(this.materiasCorrelativas, materias);
    }

    private boolean cumpleLasCorrelatividades(Alumno alumno){
        //TODO
    //  return materiasCorrelativas.stream().allMatch(materia -> alumno.aprobo(materia));
        return materiasCorrelativas.stream().allMatch(alumno::aprobo);
    }

    public boolean puedeCursar(Alumno alumno){
        //TODO
        return this.cumpleLasCorrelatividades(alumno);
    }
}
