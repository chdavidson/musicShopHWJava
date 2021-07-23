package Stock.Instruments;

import Stock.behaviours.IPlay;

public class Trumpet extends Instrument implements IPlay {

    private int numberOfValves;

    public Trumpet(String colour, String material, double buyingPrice, int numberOfValves) {
        super(colour, material, buyingPrice);
        this.setFamily(InstrumentFamily.BRASS);
        this.numberOfValves = numberOfValves;
    }

    public int getNumberOfValves() {
        return numberOfValves;
    }

    @Override
    public String play() {
        return "trumpet noises";
    }
}
