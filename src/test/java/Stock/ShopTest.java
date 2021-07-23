package Stock;

import Stock.Instruments.Guitar;
import Stock.Instruments.Piano;
import Stock.nonInstruments.SheetMusic;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ShopTest {

    private Shop shop;
    private Guitar guitar;
    private SheetMusic sheetMusic;
    private Piano piano;

    @Before
    public void setUp(){
        guitar = new Guitar("Blue", "Metal", 100, 12);
        sheetMusic = new SheetMusic("Smoke on the water", 0.5);
        piano = new Piano("Black", "wood", 300, 120);
        shop = new Shop("Music Shop", 1000);
    }

    @Test
    public void addStock() {
        shop.addToStock(guitar, 10);
        shop.addToStock(sheetMusic, 200);
        shop.addToStock(piano, 20);
        assertEquals(3, shop.getShopStock().size());
    }

    @Test
    public void removeFromStock() {
        shop.addToStock(guitar, 10);
        shop.removeFromStock(guitar, 5);
        assertEquals(5, (int)shop.getShopStock().get(guitar));
    }

    @Test
    public void calcPotentialProfits(){
        shop.addToStock(guitar, 10);
        assertEquals(700.00, shop.calcPotentialProfit(), 0.0);
    }

    @Test
    public void calcPotentialProfitsAgain(){
        shop.addToStock(guitar, 2);         //MarkUp = 140
        shop.addToStock(piano, 1);          //Markup = 210
        shop.addToStock(sheetMusic, 10);    //Markup = 3.25
        assertEquals(353.25, shop.calcPotentialProfit(), 0.0);
    }
}