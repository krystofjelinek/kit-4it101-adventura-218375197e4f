package cz.vse.adventura.logika;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrikazJdiTest {
    private HerniPlan plan;
    private PrikazJdi prikazJdi;

    @BeforeEach
    void setUp() {
        plan = new HerniPlan();
        prikazJdi = new PrikazJdi(plan);
    }

    @Test
    void provedPrikaz() {
        prikazJdi.provedPrikaz("");
    }

    @Test
    void getNazev() {
        assertEquals("jdi", prikazJdi.getNazev());
    }
}