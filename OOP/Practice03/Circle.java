package OOP.Practice03;

public class Circle {
    private double rad;

    public Circle(double rad) {
        this.rad = rad;
    }

    public Circle(Circle circle) {
        this.rad = circle.rad;
    }

    public double getRad() {
        return rad;
    }

    public double calcArea() {
        return Math.PI * (rad * rad);
    }

    public double calcCircumf() {
        return 2 * Math.PI * rad;
    }

}