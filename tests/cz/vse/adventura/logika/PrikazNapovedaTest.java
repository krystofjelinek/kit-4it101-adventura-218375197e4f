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
        assertEquals("Tvým úkolem je nalézt v potopeném vraku tři historicky cenné artefakty\n"
                + "musíš je vylovit a dostat na palubu lodi ve které jsi přijel.\n"
                + "\n" + "Můžeš zadat tyto příkazy:\n", prikazNapoveda.provedPrikaz());
    }

    @Test
    void getNazev() {
        assertEquals("nápověda", prikazNapoveda.getNazev());
    }
}