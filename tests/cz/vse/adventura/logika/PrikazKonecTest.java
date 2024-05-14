package cz.vse.adventura.logika;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/*******************************************************************************
 * Testovací třída PrikazKonecTest slouží ke komplexnímu otestování třídy PrikazKonec
 *
 * @author    Kryštof Jelínek
 * @version   LS 2023/23
 */
class PrikazKonecTest {
    private PrikazKonec prikazKonec;
    private Hra hra;

    @BeforeEach
    void setUp() {
        hra = new Hra();
        prikazKonec = new PrikazKonec(hra);
    }

    /**
     * Testuje funkcionalitu příkazu "konec".
     */
    @Test
    void provedPrikaz() {
        assertEquals("hra ukončena příkazem konec", prikazKonec.provedPrikaz());
    }

    @Test
    void getNazev() {
        assertEquals("konec", prikazKonec.getNazev());
    }
}