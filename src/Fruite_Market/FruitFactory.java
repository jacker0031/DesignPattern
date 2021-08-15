package Fruite_Market;


import java.util.HashMap;
import java.util.Map;

public class FruitFactory {
    private static Map<String, Fruit> storage = new HashMap<>();

    public static Fruit getFruit(String FruitName) {
        if (storage.get(FruitName) == null) {
            Fruit Fruitobj = new Fruit();
            storage.put(FruitName, Fruitobj);
        }
        return storage.get(FruitName);
    }
}
