package cz.vse.adventura.logika;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class PrikazVypisTest {
    private PrikazVypis prikazVypis;
    private HerniPlan plan;

    @BeforeEach
    void setUp() {
        plan = new HerniPlan();
        prikazVypis = new PrikazVypis(plan);

    }

    /**
     * Testuje příkaz "vypiš" v obou variantách. Tedy "vypiš batoh" i "vypiš prostor"
     */
    @Test
    void provedPrikaz() {
        assertEquals("Jsi v mistnosti/prostoru lodička na hladině, na které jsi přijel.." +
                        "\n" + "východy: voda" + "\n" + "věci:",
                        prikazVypis.provedPrikaz("prostor"));

        assertEquals("Vypsat obsah se nepovedlo: Batoh je prázdný",prikazVypis.provedPrikaz("batoh"));
    }

    @Test
    void getNazev() {
        assertEquals("vypiš", prikazVypis.getNazev());
    }
}