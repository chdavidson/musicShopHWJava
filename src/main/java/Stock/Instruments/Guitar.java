package Stock.Instruments;

import Stock.behaviours.IPlay;

public class Guitar extends Instrument implements IPlay {

    private int numberStrings;

    public Guitar(String colour, String material, double buyingPrice, int numberStrings) {
        super(colour, material, buyingPrice);
        this.setFamily(InstrumentFamily.STRING);
        this.numberStrings = numberStrings;
    }

    public int getNumberStrings() {
        return numberStrings;
    }

    @Override
    public String play() {
        return "guitar noises";
    }
}
