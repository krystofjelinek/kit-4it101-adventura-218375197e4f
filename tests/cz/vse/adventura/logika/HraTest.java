package cz.vse.adventura.logika;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*******************************************************************************
 * Testovací třída HraTest slouží ke komplexnímu otestování
 * třídy Hra
 *
 * @author    Jarmila Pavlíčková, Kryštof Jelínek
 * @version   pro školní rok 2016/2017 -> LS 2023/24
 */
public class HraTest {
    private Hra hra1;

    /***************************************************************************
     * Metoda se provede před spuštěním každé testovací metody. Používá se
     * k vytvoření tzv. přípravku (fixture), což jsou datové atributy (objekty),
     * s nimiž budou testovací metody pracovat.
     */
    @BeforeEach
    public void setUp() {
        hra1 = new Hra();
    }

    /***************************************************************************
     * Testuje průběh hry, po zavolání každěho příkazu testuje, zda hra končí
     * a v jaké aktuální místnosti se hráč nachází.
     * Při dalším rozšiřování hry doporučujeme testovat i jaké věci nebo osoby
     * jsou v místnosti a jaké věci jsou v batohu hráče.
     * 
     */
    @Test
    public void testPrubehHry() {
        assertEquals("lodička", hra1.getHerniPlan().getAktualniProstor().getNazev());

        hra1.zpracujPrikaz("jdi voda");
        assertEquals(false, hra1.konecHry());
        assertEquals("voda", hra1.getHerniPlan().getAktualniProstor().getNazev());

        hra1.zpracujPrikaz("jdi příď");
        assertEquals(false, hra1.konecHry());
        assertEquals("příď", hra1.getHerniPlan().getAktualniProstor().getNazev());

        hra1.zpracujPrikaz("seber řetízek");
        assertEquals(false, hra1.konecHry());
        assertEquals(false,hra1.getHerniPlan().vypisProstor(hra1.getHerniPlan().getAktualniProstor()).contains("řetízek"));
        assertEquals(true, hra1.getHerniPlan().vypisBatoh().contains("řetízek"));

        hra1.zpracujPrikaz("jdi voda");
        assertEquals(false, hra1.konecHry());
        assertEquals("voda", hra1.getHerniPlan().getAktualniProstor().getNazev());

        hra1.zpracujPrikaz("jdi lodička");
        assertEquals(false, hra1.konecHry());
        assertEquals("lodička", hra1.getHerniPlan().getAktualniProstor().getNazev());

        hra1.zpracujPrikaz("polož řetízek");
        assertEquals(false, hra1.konecHry());
        assertEquals(true,hra1.getHerniPlan().vypisProstor(hra1.getHerniPlan().getAktualniProstor()).contains("řetízek"));

        hra1.zpracujPrikaz("kolik");
        assertEquals(false, hra1.konecHry());
        assertEquals("Zatím máš v lodi 1/3 artefaktů.", hra1.getHerniPlan().kolik());

        hra1.zpracujPrikaz("jdi voda");
        assertEquals(false, hra1.konecHry());
        assertEquals("voda", hra1.getHerniPlan().getAktualniProstor().getNazev());

        hra1.zpracujPrikaz("jdi paluba");
        assertEquals(false, hra1.konecHry());
        assertEquals("paluba", hra1.getHerniPlan().getAktualniProstor().getNazev());

        hra1.zpracujPrikaz("hint");
        assertEquals(false, hra1.konecHry());
        assertEquals("Hint:\n" + "symbol...", hra1.getHerniPlan().hint());

        hra1.zpracujPrikaz("seber kříž");
        assertEquals(false, hra1.konecHry());
        assertEquals(false,hra1.getHerniPlan().vypisProstor(hra1.getHerniPlan().getAktualniProstor()).contains("kříž"));
        assertEquals(true, hra1.getHerniPlan().vypisBatoh().contains("kříž"));

        hra1.zpracujPrikaz("jdi voda");
        assertEquals(false, hra1.konecHry());
        assertEquals("voda", hra1.getHerniPlan().getAktualniProstor().getNazev());

        hra1.zpracujPrikaz("jdi lodička");
        assertEquals(false, hra1.konecHry());
        assertEquals("lodička", hra1.getHerniPlan().getAktualniProstor().getNazev());

        hra1.zpracujPrikaz("polož kříž");
        assertEquals(false, hra1.konecHry());
        assertEquals(true,hra1.getHerniPlan().vypisProstor(hra1.getHerniPlan().getAktualniProstor()).contains("kříž"));

        assertEquals("Zatím máš v lodi 2/3 artefaktů.", hra1.getHerniPlan().kolik());

        hra1.zpracujPrikaz("jdi voda");
        assertEquals(false, hra1.konecHry());
        assertEquals("voda", hra1.getHerniPlan().getAktualniProstor().getNazev());

        hra1.zpracujPrikaz("jdi paluba");
        assertEquals(false, hra1.konecHry());
        assertEquals("paluba", hra1.getHerniPlan().getAktualniProstor().getNazev());

        hra1.zpracujPrikaz("jdi schodiště");
        assertEquals(false, hra1.konecHry());
        assertEquals("schodiště", hra1.getHerniPlan().getAktualniProstor().getNazev());

        hra1.zpracujPrikaz("prozkoumej hodinky");
        assertEquals(false, hra1.konecHry());
        assertEquals("krásné starožitné hodinky, ARTEFAKT",hra1.getHerniPlan().prozkoumejVec("hodinky"));

        hra1.zpracujPrikaz("seber hodinky");
        assertEquals(false, hra1.konecHry());
        assertEquals(false,hra1.getHerniPlan().vypisProstor(hra1.getHerniPlan().getAktualniProstor()).contains("kříž"));
        assertEquals(true, hra1.getHerniPlan().vypisBatoh().contains("hodinky"));

        hra1.zpracujPrikaz("jdi paluba");
        assertEquals(false, hra1.konecHry());
        assertEquals("paluba", hra1.getHerniPlan().getAktualniProstor().getNazev());

        hra1.zpracujPrikaz("jdi voda");
        assertEquals(false, hra1.konecHry());
        assertEquals("voda", hra1.getHerniPlan().getAktualniProstor().getNazev());

        hra1.zpracujPrikaz("jdi lodička");
        assertEquals(false, hra1.konecHry());
        assertEquals("lodička", hra1.getHerniPlan().getAktualniProstor().getNazev());

        hra1.zpracujPrikaz("polož hodinky");
        assertEquals(true,hra1.getHerniPlan().vypisProstor(hra1.getHerniPlan().getAktualniProstor()).contains("kříž"));
        assertEquals(true, hra1.konecHry());

    }
}
