package BLOCK5.lab24_1_mirea;
public class Complex {
    private final int real;
    private final int imaginary;
    public Complex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    @Override
    public String toString() {
        return String.format("%d%+di", real, imaginary);
    }
}
