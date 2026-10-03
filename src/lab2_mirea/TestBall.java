package lab2_mirea;

public class TestBall {
    public static void main(String[] args){
        Ball ball = new Ball(1,2);

        System.out.println("Начальное положение: " + ball);

        ball.move(4.0, -1.0);

        System.out.println("После перемещения: " + ball);

        ball.setXY(10.0, 20.0);

        System.out.println("После изменения координат: " + ball);

    }
}
