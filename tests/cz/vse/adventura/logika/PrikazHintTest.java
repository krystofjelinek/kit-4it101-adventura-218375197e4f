package cz.vse.adventura.logika;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrikazHintTest {
    private HerniPlan plan;
    private PrikazHint prikazHint;

    @BeforeEach
    void setUp() {
        plan = new HerniPlan();
        prikazHint = new PrikazHint(plan);
    }

    @Test
    void provedPrikaz() {
        prikazHint.provedPrikaz("blalbkef");
    }

    @Test
    void getNazev() {
        assertEquals("hint", prikazHint.getNazev());
    }
}