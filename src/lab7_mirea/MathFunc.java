package lab7_mirea;
public class MathFunc implements MathCalculable {
    @Override
    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }



    @Override
    public double complexModulus(double real, double imaginary) {
        return Math.hypot(real, imaginary);
    }




    public double getCircleLength(double radius) {
        if (!Double.isFinite(radius) || radius <= 0) {
            throw new IllegalArgumentException(
                    "Радиус должен быть конечным числом больше нуля"
            );
        }
        return 2 * PI * radius;
    }
}