package Stock.Instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GuitarTest {

    private Guitar guitar;

    @Before
    public void setUp(){
        guitar = new Guitar("Green", "Wood", 100, 6);
    }

    @Test
    public void hasSixStrings() {
        assertEquals(6, guitar.getNumberStrings());
    }

    @Test
    public void guitarIsStringInstrument(){
        assertEquals(InstrumentFamily.STRING, guitar.getFamily());
    }

    @Test
    public void canPlay() {
        assertEquals("guitar noises", guitar.play());
    }
}