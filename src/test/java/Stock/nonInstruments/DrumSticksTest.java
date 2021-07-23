package Stock.nonInstruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DrumSticksTest {

    DrumSticks drumSticks;

    @Before
    public void setUp(){
        drumSticks = new DrumSticks("zzz", 4.66);
    }

    @Test
    public void getBrand() {
        assertEquals("zzz", drumSticks.getBrand());
    }

    @Test
    public void getBuyingPrice() {
        assertEquals(4.66, drumSticks.getBuyingPrice(), 0.0);
    }

    @Test
    public void getSellingPrice() {
        assertEquals(4.66*1.3, drumSticks.getSellingPrice(), 0.0);
    }

    @Test
    public void setSellingPrice() {
        drumSticks.setSellingPrice(5.12);
        assertEquals(5.12, drumSticks.getSellingPrice(), 0.0);
    }

    @Test
    public void calcMarkup() {
        assertEquals((4.66*1.3)-4.66, drumSticks.calcMarkup(), 0.0);
    }
}