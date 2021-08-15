package DesignPattern.strategy;

public class Main {
    public static void main(String[] args) {
        ImageStorage imageStorage = new ImageStorage(new JpegCompressor(), new JpegFilter());
        imageStorage.store("File1");

    }
}
