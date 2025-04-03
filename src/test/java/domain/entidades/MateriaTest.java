package domain.entidades;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Set;

class MateriaTest {
    
    @Test
    @DisplayName("Se agregan como correlativas sypn, pdep, ingles1, ayed y ads a dds")
    public void AgregarCorrelativas(){
        Materia sypn = new Materia();
        Materia pdep = new Materia();
        Materia ingles1 = new Materia();
        Materia ayed = new Materia();
        Materia ads = new Materia();
        Materia dds = new Materia();
        dds.agregarCorrelativas(sypn,pdep,ingles1,ayed,ads);

        Set<Materia> esperadas = Set.of(sypn, pdep, ingles1, ayed, ads);

        Assertions.assertEquals(esperadas, dds.getMateriasCorrelativas());
    }

}