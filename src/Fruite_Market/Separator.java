package Fruite_Market;

import Fruite_Market.Enum.Operation;

public class Separator {
    private Operation operation;
    private String fruiteName;
    private int price;
    private int quantity;

    public Separator(String[] command) {
        this.operation = Operation.valueOf(command[0]);
        if (command.length > 1) {
            this.fruiteName = command[1];
            this.price = Integer.parseInt(command[2]);
            this.quantity = Integer.parseInt(command[3]);
        }
    }

    public Operation getOperation() {
        return operation;
    }

    public String getFruitName() {
        return fruiteName;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}
