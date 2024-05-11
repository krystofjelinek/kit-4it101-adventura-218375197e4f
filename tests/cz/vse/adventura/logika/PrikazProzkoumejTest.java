package cz.vse.adventura.logika;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrikazProzkoumejTest {
    private PrikazProzkoumej prikazProzkoumej;
    private HerniPlan plan;

    @BeforeEach
    void setUp() {
        plan = new HerniPlan();
        prikazProzkoumej = new PrikazProzkoumej(plan);
    }

    @Test
    void provedPrikaz() {
        prikazProzkoumej.provedPrikaz("");
    }

    @Test
    void getNazev() {
        assertEquals("prozkoumej", prikazProzkoumej.getNazev());
    }
}