package Stock.nonInstruments;

import Stock.behaviours.ISell;

public class DrumSticks implements ISell {
    private String brand;
    private double buyingPrice;
    private double sellingPrice;

    public DrumSticks(String brand, double buyingPrice) {
        this.brand = brand;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = buyingPrice*1.3;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public double getBuyingPrice() {
        return buyingPrice;
    }

    @Override
    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public double calcMarkup(){
        return this.getSellingPrice() - this.getBuyingPrice();
    }
}
