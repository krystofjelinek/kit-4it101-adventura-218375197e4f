package cz.vse.adventura.logika;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrikazVypisTest {
    private PrikazVypis prikazVypis;
    private HerniPlan plan;

    @BeforeEach
    void setUp() {
        prikazVypis = new PrikazVypis(plan);
    }

    @Test
    void provedPrikaz() {
        prikazVypis.provedPrikaz("");
    }

    @Test
    void getNazev() {
        assertEquals("vypiš", prikazVypis.getNazev());
    }
}