package DesignPattern.iterator;


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BrowseHistory {

    private Stack<String> urls = new Stack<>();

    public void push(String url) {
        urls.push(url);
    }

    public String pop() {
        String lastUrl = urls.peek();
        urls.pop();
        return lastUrl;
    }

    public Iterator createIterator() {
        return new ListIterator(this);
    }

    public class ListIterator implements Iterator {

        private BrowseHistory history;
        private int index;
        private Stack<String> urls = (Stack<String>) history.urls.clone();

        public ListIterator(BrowseHistory history) {
            this.history = history;

        }

        @Override
        public boolean hasNext() {
            return !urls.empty();
        }

        @Override
        public String current() {
            return urls.peek();
        }

        @Override
        public void next() {
            urls.pop();
        }
    }
}
