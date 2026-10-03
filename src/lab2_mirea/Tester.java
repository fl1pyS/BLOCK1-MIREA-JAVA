package lab2_mirea;

public class Tester {
    private Circle[] circles;
    private int count;

    public Tester(int size){
        circles = new Circle[size];
        count  = 0;
    }

    public void addCircle(Circle circle){
        if (count< circles.length){
            circles[count] = circle;
            count++;
        }
        else{
            System.out.println("Массив заполнен!");
        }
    }

    public void printCircles(){
        for (int i = 0; i < count; i ++) {
            System.out.println(circles[i]);
        }
    }


    public static void main(String[] args){
        Tester tester = new Tester(3);

        Point point1 = new Point(2,3);
        Point point2 = new Point(5,10);


        Circle circle1 = new Circle(point1,3);
        Circle circle2 = new Circle(point2, 6);

        tester.addCircle(circle1);
        tester.addCircle(circle2);
        tester.printCircles();
    }
}
