package domain.entidades;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class InscripcionTest {



    @Test
    @DisplayName("Un alumno con sypn,pdep,ingles1,ayed y ads puede inscribirse a dds")
    public void InscripcionAprobada(){
        Materia sypn = new Materia();
        Materia pdep = new Materia();
        Materia ingles1 = new Materia();
        Materia ayed = new Materia();
        Materia ads = new Materia();
        Materia dds = new Materia();
        dds.agregarCorrelativas(sypn,pdep,ingles1,ayed,ads);

        Alumno alumno = new Alumno();
        alumno.agregarAprobadas(sypn,pdep,ingles1,ayed,ads);

        Inscripcion inscripcion = new Inscripcion(alumno);
        inscripcion.agregarMaterias(dds);

        Assertions.assertTrue(inscripcion.aprobada());
    }

    @Test
    @DisplayName("Un alumno sin sypn tiene su inscripción rechazada")
    public void InscripcionRechazada(){
        Materia sypn = new Materia();
        Materia pdep = new Materia();
        Materia ingles1 = new Materia();
        Materia ayed = new Materia();
        Materia ads = new Materia();
        Materia dds = new Materia();
        dds.agregarCorrelativas(sypn,pdep,ingles1,ayed,ads);

        Alumno alumno = new Alumno();
        alumno.agregarAprobadas(pdep,ingles1,ayed,ads);

        Inscripcion inscripcion = new Inscripcion(alumno);
        inscripcion.agregarMaterias(dds);

        Assertions.assertFalse(inscripcion.aprobada());
    }


}