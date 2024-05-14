package cz.vse.adventura.logika;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/*******************************************************************************
 * Testovací třída PrikazJdiTest slouží ke komplexnímu otestování třídy PrikazJdi
 *
 * @author    Kryštof Jelínek
 * @version   LS 2023/23
 */
class PrikazJdiTest {
    private HerniPlan plan;
    private PrikazJdi prikazJdi;

    @BeforeEach
    void setUp() {
        plan = new HerniPlan();
        prikazJdi = new PrikazJdi(plan);
    }
    /**
     * Testuje funkcionalitu příkazu "jdi".
     * */
    @Test
    void provedPrikaz() {
        prikazJdi.provedPrikaz("voda");
        assertEquals("voda", plan.getAktualniProstor().getNazev());

        prikazJdi.provedPrikaz("ostrov");
        assertNotEquals("ostrov", plan.getAktualniProstor().getNazev());
    }

    @Test
    void getNazev() {
        assertEquals("jdi", prikazJdi.getNazev());
    }
}