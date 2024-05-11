package cz.vse.adventura.logika;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrikazPolozTest {
    private PrikazPoloz prikazPoloz;
    private HerniPlan plan;

    @BeforeEach
    void setUp() {
        plan = new HerniPlan();
        prikazPoloz = new PrikazPoloz(plan);
    }

    @Test
    void provedPrikaz() {
        prikazPoloz.provedPrikaz("");
    }

    @Test
    void getNazev() {
        assertEquals("polož", prikazPoloz.getNazev());
    }
}