package Stock.Instruments;

import Stock.behaviours.ISell;

public abstract class Instrument implements ISell {
    private String colour;
    private String material;
    private InstrumentFamily family;
    private double buyingPrice;
    private double sellingPrice;


    public Instrument(String colour, String material, double buyingPrice) {
        this.colour = colour;
        this.material = material;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = buyingPrice*1.7;
    }

    public double getBuyingPrice(){
        return this.buyingPrice;
    }

    public double getSellingPrice(){
        return this.sellingPrice;
    }

    public void setSellingPrice(double sellingPrice){
        this.sellingPrice = sellingPrice;
    }

    public double calcMarkup(){
        return getSellingPrice() - getBuyingPrice();
    }

    public InstrumentFamily getFamily() {
        return family;
    }

    public void setFamily(InstrumentFamily family) {
        this.family = family;
    }
}
