package Stock.nonInstruments;

import Stock.behaviours.ISell;

public class SheetMusic implements ISell {
    private String songName;
    private double buyingPrice;
    private double sellingPrice;

    public String getSongName() {
        return songName;
    }

    public SheetMusic(String songName, double buyingPrice) {
        this.songName = songName;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = buyingPrice*1.65;
    }

    @Override
    public double getBuyingPrice() {
        return this.buyingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    @Override
    public double getSellingPrice() {
        return this.sellingPrice;
    }

    @Override
    public double calcMarkup() {
        return this.getSellingPrice() - this.getBuyingPrice();
    }
}
