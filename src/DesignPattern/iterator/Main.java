package DesignPattern.iterator;

import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        BrowseHistory browseHistory = new BrowseHistory();
        browseHistory.push("a");
        browseHistory.push("b");
        browseHistory.push("c");
        browseHistory.pop();
        browseHistory.push("d");
        Iterator iterator = browseHistory.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.current());
            iterator.next();
        }
        Iterator iterator1 = browseHistory.createIterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.current());
            iterator1.next();
        }


    }
}
