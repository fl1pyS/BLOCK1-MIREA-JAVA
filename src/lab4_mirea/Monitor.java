package lab4_mirea;

public class Monitor {
    private String model;
    private double diagonal;
    private int width;
    private int height;

    public Monitor(
            String model,
            double diagonal,
            int width,
            int height
    ) {
        this.model = model;
        this.diagonal = diagonal;
        this.width = width;
        this.height = height;
    }

    public String getModel() {
        return model;
    }
    public double getDiagonal() {
        return diagonal;
    }
    public int getWidth() {
        return width;
    }
    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "model='" + model + '\'' +
                ", diagonal=" + diagonal + " inches" +
                ", resolution=" + width + "x" + height +
                '}';
    }
}
