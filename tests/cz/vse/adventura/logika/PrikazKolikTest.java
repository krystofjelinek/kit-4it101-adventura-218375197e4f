package cz.vse.adventura.logika;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrikazKolikTest {
    private HerniPlan plan;
    private PrikazKolik prikazKolik;

    @BeforeEach
    void setUp() {
        plan = new HerniPlan();
        prikazKolik = new PrikazKolik(plan);
    }

    @Test
    void provedPrikaz() {
        prikazKolik.provedPrikaz("");
    }

    @Test
    void getNazev() {
        assertEquals("kolik", prikazKolik.getNazev());
    }
}