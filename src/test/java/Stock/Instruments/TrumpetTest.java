package Stock.Instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TrumpetTest {

    private Trumpet trumpet;

    @Before
    public void setUp(){
        trumpet = new Trumpet("Yellow", "Brass",80, 12);
    }

    @Test
    public void has12Valves() {
        assertEquals(12, trumpet.getNumberOfValves());
    }

    @Test
    public void play() {
        assertEquals("trumpet noises", trumpet.play());
    }

    @Test
    public void isBrassInstrument(){
        assertEquals(InstrumentFamily.BRASS, trumpet.getFamily());
    }
}