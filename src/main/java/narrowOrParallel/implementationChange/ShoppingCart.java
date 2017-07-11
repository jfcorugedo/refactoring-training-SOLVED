package narrowOrParallel.implementationChange;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    
	private List<Integer> prices = new ArrayList<>();
	private List<Price> newPrices = new ArrayList<>();

    public void add(int price) {
        this.prices.add(price);
        this.newPrices.add(new Price(price));
    }

    public Price calculateTotalPrice() {
        return this.newPrices.stream().reduce(new Price(0), (memo, price) -> new Price(memo.getPrice() + price.getPrice()));
    }

    public boolean hasDiscount() {
        return calculateTotalPrice().getPrice() >= 100;
    }

    public int numberOfProducts() {
        return this.prices.size();
    }
    
}
