package cz.vse.adventura.logika;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/*******************************************************************************
 * Testovací třída PrikazKolikTest slouží ke komplexnímu otestování třídy PrikazKolik
 *
 * @author    Kryštof Jelínek
 * @version   LS 2023/23
 */
class PrikazKolikTest {
    private HerniPlan plan;
    private PrikazKolik prikazKolik;

    @BeforeEach
    void setUp() {
        plan = new HerniPlan();
        prikazKolik = new PrikazKolik(plan);
    }

    /**
     * Testuje funcionalitu příkazu "kolik"
     */
    @Test
    void provedPrikaz() {
        assertEquals("Zatím máš v lodi 0/3 artefaktů.", prikazKolik.provedPrikaz());
    }

    @Test
    void getNazev() {
        assertEquals("kolik", prikazKolik.getNazev());
    }
}