package Stock.nonInstruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SheetMusicTest {

    SheetMusic sheetMusic;

    @Before
    public void setUp(){
        sheetMusic = new SheetMusic("Happy Birthday", 0.5);
    }

    @Test
    public void getSongName() {
        assertEquals("Happy Birthday", sheetMusic.getSongName());
    }
}