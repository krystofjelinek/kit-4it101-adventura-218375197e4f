package cz.vse.adventura.logika;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*******************************************************************************
 * Testovací třída ProstorTest slouží ke komplexnímu otestování
 * třídy Prostor
 *
 * @author    Jarmila Pavlíčková, Kryštof Jelínek
 * @version   pro školní rok 2016/2017 -> LS 2023/24
 */
public class ProstorTest {
    private Prostor lodicka;
    private Prostor voda;
    private Prostor prid;
    private Prostor zad;
    private Prostor paluba;
    private Prostor schodiste;
    private Prostor sklad;
    private Prostor kajuta;

    /**
     * Vytváří prostory hry, kterými hráč může procházet.
     */
    @BeforeEach
    public void setUp() {
        lodicka = new Prostor("lodička","lodička na hladině, na které jsi přijel.");
        voda = new Prostor("voda", "voda");
        prid = new Prostor("příď","příď potopené lodi");
        zad = new Prostor("záď","záď potopené lodi");
        paluba = new Prostor("paluba","paluba - střed potopené lodi");
        schodiste = new Prostor("schodiště","Schodiště do podpalubí potopené lodi");
        sklad = new Prostor("sklad","sklad v podpalubí potopené lodi");
        kajuta = new Prostor("kajuta","kajuta v podpalubí potopené lodi");

        lodicka.setVychod(voda);
        voda.setVychod(lodicka);
        voda.setVychod(paluba);
        voda.setVychod(prid);
        voda.setVychod(zad);
        paluba.setVychod(voda);
        paluba.setVychod(zad);
        paluba.setVychod(prid);
        paluba.setVychod(schodiste);
        zad.setVychod(voda);
        zad.setVychod(paluba);
        prid.setVychod(paluba);
        prid.setVychod(voda);
        schodiste.setVychod(paluba);
        schodiste.setVychod(sklad);
        schodiste.setVychod(kajuta);
        kajuta.setVychod(schodiste);
        sklad.setVychod(schodiste);
    }

    /**
     * Testuje, zda jsou správně nastaveny průchody mezi prostory hry.
     */
    @Test
    public  void testLzeProjit() {


        assertEquals(voda, lodicka.vratSousedniProstor("voda"));
        assertEquals(lodicka, voda.vratSousedniProstor("lodička"));
        assertEquals(prid, voda.vratSousedniProstor("příď"));
        assertEquals(paluba, voda.vratSousedniProstor("paluba"));
        assertEquals(zad, voda.vratSousedniProstor("záď"));
        assertEquals(voda, prid.vratSousedniProstor("voda"));
        assertEquals(voda, paluba.vratSousedniProstor("voda"));
        assertEquals(voda, zad.vratSousedniProstor("voda"));
        assertEquals(prid, paluba.vratSousedniProstor("příď"));
        assertEquals(paluba, prid.vratSousedniProstor("paluba"));
        assertEquals(paluba, zad.vratSousedniProstor("paluba"));
        assertEquals(zad, paluba.vratSousedniProstor("záď"));
        assertEquals(schodiste, paluba.vratSousedniProstor("schodiště"));
        assertEquals(paluba, schodiste.vratSousedniProstor("paluba"));
        assertEquals(schodiste, kajuta.vratSousedniProstor("schodiště"));
        assertEquals(kajuta, schodiste.vratSousedniProstor("kajuta"));
        assertEquals(schodiste, sklad.vratSousedniProstor("schodiště"));
        assertEquals(sklad, schodiste.vratSousedniProstor("sklad"));

        assertEquals(null, voda.vratSousedniProstor("sklad"));
    }

}
