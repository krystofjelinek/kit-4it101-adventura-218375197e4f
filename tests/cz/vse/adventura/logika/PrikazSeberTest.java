package cz.vse.adventura.logika;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrikazSeberTest {
    private PrikazSeber prikazSeber;
    private HerniPlan plan;

    @BeforeEach
    void setUp() {
        plan = new HerniPlan();
        prikazSeber = new PrikazSeber(plan);
    }

    @Test
    void provedPrikaz() {
        prikazSeber.provedPrikaz("");
    }

    @Test
    void getNazev() {
        assertEquals("seber", prikazSeber.getNazev());
    }
}