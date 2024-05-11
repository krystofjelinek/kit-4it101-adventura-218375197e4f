package cz.vse.adventura.logika;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrikazNapovedaTest {
    private PrikazNapoveda prikazNapoveda;
    private SeznamPrikazu seznamPrikazu;
    @BeforeEach
    void setUp() {
        seznamPrikazu = new SeznamPrikazu();
        prikazNapoveda = new PrikazNapoveda(seznamPrikazu);
    }

    @Test
    void provedPrikaz() {
        prikazNapoveda.provedPrikaz("");
    }

    @Test
    void getNazev() {
        assertEquals("nápověda", prikazNapoveda.getNazev());
    }
}