package DesignPattern.iterator;

public interface Iterator {
    boolean hasNext();

    String current();

    void next();
}

//implement Iterator<String>
