package cz.vse.adventura.logika;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*******************************************************************************
 * Testovací třída SeznamPrikazuTest slouží ke komplexnímu otestování třídy  
 * SeznamPrikazu
 * 
 * @author    Luboš Pavlíček
 * @version   pro školní rok 2016/2017
 */
public class SeznamPrikazuTest {
    private Hra hra;
    private HerniPlan plan;
    private PrikazKonec prKonec;
    private PrikazJdi prJdi;
    private PrikazHint prHint;
    private PrikazKolik prKolik;
    private PrikazPoloz prPoloz;
    private PrikazSeber prSeber;
    private PrikazProzkoumej prProzkoumej;
    private PrikazVypis prVypis;

    
    @BeforeEach
    public void setUp() {
        hra = new Hra();
        plan = new HerniPlan();
        prKonec = new PrikazKonec(hra);
        prJdi = new PrikazJdi(hra.getHerniPlan());
        prHint = new PrikazHint(plan);
        prKolik = new PrikazKolik(plan);
        prPoloz = new PrikazPoloz(plan);
        prSeber = new PrikazSeber(plan);
        prProzkoumej = new PrikazProzkoumej(plan);
        prVypis = new PrikazVypis(plan);
    }

    @Test
    public void testVlozeniVybrani() {
        SeznamPrikazu seznPrikazu = new SeznamPrikazu();
        seznPrikazu.vlozPrikaz(prKonec);
        seznPrikazu.vlozPrikaz(prJdi);
        seznPrikazu.vlozPrikaz(prHint);
        seznPrikazu.vlozPrikaz(prKolik);
        seznPrikazu.vlozPrikaz(prPoloz);
        seznPrikazu.vlozPrikaz(prSeber);
        seznPrikazu.vlozPrikaz(prProzkoumej);
        seznPrikazu.vlozPrikaz(prVypis);

        assertEquals(prKonec, seznPrikazu.vratPrikaz("konec"));
        assertEquals(prJdi, seznPrikazu.vratPrikaz("jdi"));
        assertEquals(prHint, seznPrikazu.vratPrikaz("hint"));
        assertEquals(prKolik, seznPrikazu.vratPrikaz("kolik"));
        assertEquals(prPoloz, seznPrikazu.vratPrikaz("polož"));
        assertEquals(prSeber, seznPrikazu.vratPrikaz("seber"));
        assertEquals(prProzkoumej, seznPrikazu.vratPrikaz("prozkoumej"));
        assertEquals(prVypis, seznPrikazu.vratPrikaz("vypiš"));
        assertEquals(null, seznPrikazu.vratPrikaz("nápověda"));
    }
    /**
     * Testuje, zda jsou zadané příkazy platné.
     */
    @Test
    public void testJePlatnyPrikaz() {
        SeznamPrikazu seznPrikazu = new SeznamPrikazu();
        seznPrikazu.vlozPrikaz(prKonec);
        seznPrikazu.vlozPrikaz(prJdi);
        seznPrikazu.vlozPrikaz(prSeber);
        seznPrikazu.vlozPrikaz(prPoloz);
        seznPrikazu.vlozPrikaz(prProzkoumej);
        seznPrikazu.vlozPrikaz(prKolik);
        seznPrikazu.vlozPrikaz(prVypis);
        seznPrikazu.vlozPrikaz(prHint);

        assertEquals(true, seznPrikazu.jePlatnyPrikaz("konec"));
        assertEquals(false, seznPrikazu.jePlatnyPrikaz("nápověda"));
        assertEquals(true, seznPrikazu.jePlatnyPrikaz("jdi"));
        assertEquals(true, seznPrikazu.jePlatnyPrikaz("seber"));
        assertEquals(true, seznPrikazu.jePlatnyPrikaz("polož"));
        assertEquals(true, seznPrikazu.jePlatnyPrikaz("prozkoumej"));
        assertEquals(true, seznPrikazu.jePlatnyPrikaz("vypiš"));
        assertEquals(true, seznPrikazu.jePlatnyPrikaz("hint"));
        assertEquals(true, seznPrikazu.jePlatnyPrikaz("kolik"));

        assertEquals(false, seznPrikazu.jePlatnyPrikaz("Konec"));
        assertEquals(false, seznPrikazu.jePlatnyPrikaz("Exit"));
        assertEquals(false, seznPrikazu.jePlatnyPrikaz("False"));
        assertEquals(false, seznPrikazu.jePlatnyPrikaz("prrrozkoumej"));
    }
    /**
     * Testuje, zda jsou názvy příkazů platné.
     */
    @Test
    public void testNazvyPrikazu() {
        SeznamPrikazu seznPrikazu = new SeznamPrikazu();
        seznPrikazu.vlozPrikaz(prKonec);
        seznPrikazu.vlozPrikaz(prJdi);
        seznPrikazu.vlozPrikaz(prSeber);
        seznPrikazu.vlozPrikaz(prPoloz);
        seznPrikazu.vlozPrikaz(prProzkoumej);
        seznPrikazu.vlozPrikaz(prKolik);
        seznPrikazu.vlozPrikaz(prVypis);
        seznPrikazu.vlozPrikaz(prHint);

        String nazvy = seznPrikazu.vratNazvyPrikazu();
        assertEquals(true, nazvy.contains("konec"));
        assertEquals(true, nazvy.contains("jdi"));
        assertEquals(true, nazvy.contains("seber"));
        assertEquals(true, nazvy.contains("polož"));
        assertEquals(true, nazvy.contains("prozkoumej"));
        assertEquals(true, nazvy.contains("kolik"));
        assertEquals(true, nazvy.contains("vypiš"));
        assertEquals(true, nazvy.contains("hint"));

        assertEquals(false, nazvy.contains("Konec"));
        assertEquals(false, nazvy.contains("blabol"));
        assertEquals(false, nazvy.contains("xx"));
    }
}
