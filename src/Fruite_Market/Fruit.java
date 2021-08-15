package Fruite_Market;

import java.util.ArrayList;
import java.util.List;

public class Fruit {
    private List<Transaction> fruitList = new ArrayList<>();
    private int quantity;

    public Fruit() {
        quantity = 0;
    }

    public void buy(Transaction purchase) {
        fruitList.add(purchase);
        quantity += purchase.quantity;
    }

    public void sell(Transaction selling) {
        int sellWeight = selling.quantity;
        if (quantity < sellWeight)
            throw new IllegalArgumentException("Not Available");
        quantity -= sellWeight;
        int cost = 0;
        for (int i = 0; i < fruitList.size(); i++) {
            Transaction purchase = fruitList.get(i);
            if (purchase.quantity <= sellWeight) {
                sellWeight -= purchase.quantity;
                cost += purchase.quantity * purchase.price;
                fruitList.remove(0);
                i--;
            } else {
                int remaining = purchase.quantity - sellWeight;
                cost += sellWeight * purchase.price;
                fruitList.set(0, new Transaction(selling.price, remaining));
                break;
            }
        }
        Ledger.setProfit(Ledger.getProfit() + (selling.quantity * selling.price - cost));
    }
}
