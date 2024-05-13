package cz.vse.adventura.logika;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrikazHintTest {
    private HerniPlan plan;
    private PrikazHint prikazHint;
    private PrikazJdi prikazJdi;

    @BeforeEach
    void setUp() {
        plan = new HerniPlan();
        prikazHint = new PrikazHint(plan);
        prikazJdi = new PrikazJdi(plan);
    }

    @Test
    void provedPrikaz() {
        prikazJdi.provedPrikaz("voda");
        prikazJdi.provedPrikaz("paluba");
        assertEquals("Hint:\n" + "symbol...",prikazHint.provedPrikaz());

        prikazJdi.provedPrikaz("voda");
        assertEquals("Chyba při vypsání hintu: Pro tento prostor nelze použít hint",prikazHint.provedPrikaz());

    }

    @Test
    void getNazev() {
        assertEquals("hint", prikazHint.getNazev());
    }
}