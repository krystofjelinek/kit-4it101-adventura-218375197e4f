package cz.vse.adventura.logika;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/*******************************************************************************
 * Testovací třída PrikazProzkoumejTest slouží ke komplexnímu otestování třídy PrikazProzkoumej
 *
 * @author    Kryštof Jelínek
 * @version   LS 2023/23
 */
class PrikazProzkoumejTest {
    private PrikazProzkoumej prikazProzkoumej;
    private PrikazJdi prikazJdi;
    private HerniPlan plan;

    @BeforeEach
    void setUp() {
        plan = new HerniPlan();
        prikazProzkoumej = new PrikazProzkoumej(plan);
        prikazJdi = new PrikazJdi(plan);
    }

    /**
     * Testuje funkcionalitu příkazu "prozkoumej".
     */
    @Test
    void provedPrikaz() {
        prikazJdi.provedPrikaz("voda");
        prikazJdi.provedPrikaz("paluba");
        assertEquals("nábožensky drahocenný kříž, ARTEFAKT", prikazProzkoumej.provedPrikaz("kříž"));
        assertEquals("Prozkoumat věc se nepovedlo: Tato věc se v prostoru nenachází.", prikazProzkoumej.provedPrikaz("xx"));
    }

    @Test
    void getNazev() {
        assertEquals("prozkoumej", prikazProzkoumej.getNazev());
    }
}