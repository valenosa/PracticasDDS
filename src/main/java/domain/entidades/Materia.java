package domain.entidades;

import java.util.ArrayList;
import java.util.List;

public class Materia {
    private List<Materia> materiasNecesarias;

    public Materia() {
        materiasNecesarias = new ArrayList<Materia>();
    }

    private boolean cumpleLasCorrelatividades(Alumno alumno){
        return true;
    }

    public boolean puedeCursar(Alumno alumno){
        return true;
    }
}
