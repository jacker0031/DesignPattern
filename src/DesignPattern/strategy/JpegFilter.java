package DesignPattern.strategy;

public class JpegFilter implements Filter {

    @Override
    public void filter(String fileName) {
        System.out.println("Filter using JPEG");
    }
}
