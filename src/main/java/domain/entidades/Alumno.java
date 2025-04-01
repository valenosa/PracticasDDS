package domain.entidades;

import java.util.ArrayList;
import java.util.List;

public class Alumno {
    private List<Materia> materiasAprobadas;

    public Alumno() {
        materiasAprobadas = new ArrayList<Materia>();
    }

    public boolean puedeInscribirse(List<Materia> materiasPorCursar) {
        return true;
    }

    public boolean aprobo(Materia materia){
        return true;
    }
}
