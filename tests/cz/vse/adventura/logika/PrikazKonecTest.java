package cz.vse.adventura.logika;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrikazKonecTest {
    private PrikazKonec prikazKonec;
    private Hra hra;

    @BeforeEach
    void setUp() {
        hra = new Hra();
        prikazKonec = new PrikazKonec(hra);
    }

    @Test
    void provedPrikaz() {
        assertEquals("hra ukončena příkazem konec", prikazKonec.provedPrikaz());
    }

    @Test
    void getNazev() {
        assertEquals("konec", prikazKonec.getNazev());
    }
}