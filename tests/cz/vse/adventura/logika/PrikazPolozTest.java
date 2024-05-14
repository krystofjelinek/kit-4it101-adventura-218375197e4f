package cz.vse.adventura.logika;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/*******************************************************************************
 * Testovací třída PrikazPolozTest slouží ke komplexnímu otestování třídy PrikazPoloz
 *
 * @author    Kryštof Jelínek
 * @version   LS 2023/23
 */
class PrikazPolozTest {
    private PrikazPoloz prikazPoloz;
    private PrikazSeber prikazSeber;
    private PrikazJdi prikazJdi;
    private HerniPlan plan;

    @BeforeEach
    void setUp() {
        plan = new HerniPlan();
        prikazPoloz = new PrikazPoloz(plan);
        prikazJdi = new PrikazJdi(plan);
        prikazSeber = new PrikazSeber(plan);
    }

    /**
     * Testuje funkcionalitu příkazu "polož"
     */
    @Test
    void provedPrikaz() {
        prikazJdi.provedPrikaz("voda");
        prikazJdi.provedPrikaz("paluba");
        prikazSeber.provedPrikaz("kříž");
        assertEquals("Věc kříž byla úspěšně položena!",prikazPoloz.provedPrikaz("kříž"));
        assertEquals("Položit věc se nepodvedlo: Tato věc není v batohu",prikazPoloz.provedPrikaz("xx"));

    }

    @Test
    void getNazev() {
        assertEquals("polož", prikazPoloz.getNazev());
    }
}