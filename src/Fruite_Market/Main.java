package Fruite_Market;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            String[] operation = input.split(" ");
            //split the input Line in to
            Separator command = new Separator(operation);
            //separate input into 4 diffrent variable and that variable is also encapsulate so that can be get but get method
            switch (command.getOperation()) {
                case BUY -> {
                    //Fruit has param like Fruit Name and List or previous Transaction Record
                    //Fruitfactory store the Object of fruit(One fruit have same Object for all command)
                    Fruit fruitObj = FruitFactory.getFruit(command.getFruitName());
                    fruitObj.buy(new Transaction(command.getPrice(), command.getQuantity()));
                    break;
                }
                case SELL -> {
                    Fruit fruitName = FruitFactory.getFruit(command.getFruitName());
                    fruitName.sell(new Transaction((command.getPrice()), command.getQuantity()));
                    break;
                }
                case PROFIT -> {
                    System.out.println(Ledger.getProfit());
                    return;
                }
                default -> throw new IllegalArgumentException("INPUT FORMAT IS NOT VALID");
            }
        }
    }
}
