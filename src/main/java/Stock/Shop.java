package Stock;

import Stock.behaviours.ISell;

import java.util.HashMap;
import java.util.Set;

public class Shop {
    private HashMap<ISell, Integer> shopStock;
    private String shopName;
    private double till;

    public Shop(String shopName, double till) {
        this.shopName = shopName;
        this.till = till;
        shopStock = new HashMap<>();
    }

    public HashMap<ISell, Integer> getShopStock() {
        return shopStock;
    }

    public void addToStock(ISell stockItem, int quantity){
        shopStock.put(stockItem, quantity);
    }

    public void removeFromStock(ISell stockItem, int quantity){
        shopStock.replace(stockItem, shopStock.get(stockItem), shopStock.get(stockItem)-quantity);
    }

    public double calcPotentialProfit(){
        final double[] total = {0.0};
        shopStock.forEach(
                (key,value) -> { total[0] +=key.calcMarkup()*value;
        });
        return total[0];
    }
}
