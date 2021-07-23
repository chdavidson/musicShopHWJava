package Stock.Instruments;

import Stock.behaviours.IPlay;

public class Piano extends Instrument implements IPlay{
    private int numberOfKeys;

    public Piano(String colour, String material,double buyingPrice, int numberOfKeys) {
        super(colour, material, buyingPrice);
        this.setFamily(InstrumentFamily.PERCUSSION);
        this.numberOfKeys = numberOfKeys;
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }

    @Override
    public String play() {
        return "piano noises";
    }
}
