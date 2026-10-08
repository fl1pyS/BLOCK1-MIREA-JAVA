package lab7_mirea;
public class MathFuncTest {
    public static void main(String[] args) {
        MathFunc math = new MathFunc();
        MathCalculable calculator = math;
        System.out.println(
                "2 в степени 3: " + calculator.power(2, 3)
        );


        System.out.println(
                "Модуль числа 3 + 4i: " +
                        calculator.complexModulus(3, 4)
        );



        System.out.printf(
                "Длина окружности радиуса 5: %.2f%n",
                math.getCircleLength(5)
        );
    }
}