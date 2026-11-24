package BLOCK5.lab24_1_mirea;
public class ConcreteFactory implements ComplexAbstractFactory {
    public Complex createComplex() {
        return createComplex(0, 0);
    }


    public Complex createComplex(int real, int imaginary) {
        return new Complex(real, imaginary);
    }
}