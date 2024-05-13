package cz.vse.adventura.logika;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BatohTest {

    private Batoh batoh;
    private Vec vecPrenositelna;
    private Vec vecNeprenositelna;

    @BeforeEach
    void setUp() {
        vecPrenositelna = new Vec("vec1", "tajnaVec", true);
        vecNeprenositelna = new Vec("vec2", "tajnaVec", false);
        batoh = new Batoh();

    }
    @Test
    void pridejVecDoBatohu() {
        batoh.pridejVecDoBatohu(vecPrenositelna);
    }
    @Test
    void vratObsahBatohu() {
        batoh.pridejVecDoBatohu(vecPrenositelna);
        batoh.vratObsahBatohu();
    }
    @Test
    void vyhodVecZBatohu() {
        batoh.pridejVecDoBatohu(vecPrenositelna);
        batoh.vyhodVecZBatohu(vecPrenositelna.getNazev());
    }

    @Test
    void jeVecVBatohu() {
        batoh.pridejVecDoBatohu(vecPrenositelna);
        assertEquals(true, batoh.jeVecVBatohu(vecPrenositelna.getNazev()));
        assertEquals(false, batoh.jeVecVBatohu(vecNeprenositelna.getNazev()));
    }

    @Test
    void getVec() {
        batoh.pridejVecDoBatohu(vecPrenositelna);
        assertEquals(vecPrenositelna, batoh.getVec(vecPrenositelna.getNazev()));
    }
}