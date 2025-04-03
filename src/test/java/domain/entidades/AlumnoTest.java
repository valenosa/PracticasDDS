package domain.entidades;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Set;

class AlumnoTest {

    @Test
    @DisplayName("Se agregan como aprobadas sypn, pdep, ingles1, ayed y ads al alumno")
    public void AgregarAprobadas(){
        Materia sypn = new Materia();
        Materia pdep = new Materia();
        Materia ingles1 = new Materia();
        Materia ayed = new Materia();
        Materia ads = new Materia();

        Alumno alumno = new Alumno();

        alumno.agregarAprobadas(sypn,pdep,ingles1,ayed,ads);

        Set<Materia> esperadas = Set.of(sypn, pdep, ingles1, ayed, ads);

        Assertions.assertEquals(esperadas, alumno.getMateriasAprobadas());
    }

    @Test
    @DisplayName("Alumno aprobó sypn")
    public void materiaAprobada(){
        Materia sypn = new Materia();
        Materia pdep = new Materia();
        Materia ingles1 = new Materia();
        Materia ayed = new Materia();
        Materia ads = new Materia();

        Alumno alumno = new Alumno();

        alumno.agregarAprobadas(sypn,pdep,ingles1,ayed,ads);

        Assertions.assertTrue(alumno.aprobo(sypn));
    }

}