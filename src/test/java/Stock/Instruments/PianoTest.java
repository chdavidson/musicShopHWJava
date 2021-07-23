package Stock.Instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PianoTest {

    Piano piano;

    @Before
    public void setUp(){
        piano = new Piano("Black", "Wood", 500, 120);
    }

    @Test
    public void canPlay(){
        assertEquals("piano noises", piano.play());
    }

    @Test
    public void isPercussionInstruement(){
        assertEquals(InstrumentFamily.PERCUSSION, piano.getFamily());
    }

    @Test
    public void has120Keys(){
        assertEquals(120, piano.getNumberOfKeys());
    }

}