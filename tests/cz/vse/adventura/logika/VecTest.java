package cz.vse.adventura.logika;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VecTest {
    private Vec vec1;
    private Vec vec2;

    @BeforeEach
    void setUp() {
        vec1 = new Vec("vec1", "tajnaVec", true);
        vec2 = new Vec("vec2", null, false);
    }

    @Test
    void getNazev() {
        assertEquals("vec1", vec1.getNazev());
        assertEquals("vec2", vec2.getNazev());
    }

    @Test
    void getTajnyPopis() {
        assertEquals("tajnaVec", vec1.getTajnyPopis());
        assertEquals(null, vec2.getTajnyPopis());
    }

    @Test
    void isPrenositelna() {
        assertEquals(true, vec1.isPrenositelna());
        assertEquals(false, vec2.isPrenositelna());
    }
}