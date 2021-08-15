package DesignPattern.strategy;

public class PngFilter implements Filter {

    @Override
    public void filter(String fileName) {
        System.out.println("Filter using PNG");
    }
}
