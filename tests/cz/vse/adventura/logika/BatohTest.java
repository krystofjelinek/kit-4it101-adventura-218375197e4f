package cz.vse.adventura.logika;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BatohTest {

    private Batoh batoh;
    private Vec vec;

    @BeforeEach
    void setUp() {
        vec = new Vec("vec", "tajnaVec", true);
        batoh = new Batoh();
        batoh.pridejVecDoBatohu(vec);
    }

    @Test
    void vratObsahBatohu() {
        batoh.vratObsahBatohu();
    }

    @Test
    void pridejVecDoBatohu() {
        assertEquals(1, batoh.vratObsahBatohu().size());
    }

    @Test
    void vyhodVecZBatohu() {
        batoh.vyhodVecZBatohu(vec.getNazev());
    }

    @Test
    void jeVecVBatohu() {
        assertEquals(true, batoh.jeVecVBatohu(vec.getNazev()));
    }

    @Test
    void getVec() {
        assertEquals(vec, batoh.getVec(vec.getNazev()));
    }
}