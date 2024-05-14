package cz.vse.adventura.logika;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/*******************************************************************************
 * Testovací třída PrikazSeberTest slouží ke komplexnímu otestování třídy PrikazSeber
 *
 * @author    Kryštof Jelínek
 * @version   LS 2023/23
 */
class PrikazSeberTest {
    private PrikazSeber prikazSeber;
    private PrikazJdi prikazJdi;
    private HerniPlan plan;

    @BeforeEach
    void setUp() {
        plan = new HerniPlan();
        prikazSeber = new PrikazSeber(plan);
        prikazJdi = new PrikazJdi(plan);
    }

    /**
     * Testuje funkcionalitu příkazu "seber"
     */
    @Test
    void provedPrikaz() {
        prikazJdi.provedPrikaz("voda");
        prikazJdi.provedPrikaz("paluba");
        assertEquals("Věc kříž byla sebrána.", prikazSeber.provedPrikaz("kříž"));
        assertEquals("Sebrat věc se nepodvedlo: Tato věc není přenositelná", prikazSeber.provedPrikaz("dřevo"));
        prikazJdi.provedPrikaz("voda");
        assertEquals("Sebrat věc se nepodvedlo: Tento prostor tuto věc neobsahuje!", prikazSeber.provedPrikaz("xx"));

    }

    @Test
    void getNazev() {
        assertEquals("seber", prikazSeber.getNazev());
    }
}