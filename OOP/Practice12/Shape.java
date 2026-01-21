package OOP.Practice12;

public interface Shape {
    public double getArea();
}

class Rectangle implements Shape {
    private double l, w;

    Rectangle (double l, double w) {
        this.l = l;
        this.w = w;
    } 

    public double getArea() {
        return l * w;
    } 
    
}

class Circle implements Shape {
    private double rad;

    Circle(double rad) {
        this.rad = rad;
    }

    public double getArea() {
        return Math.PI * rad * rad;
    }
}

class Triangle implements Shape {
    private double b, h;

    Triangle(double b, double h) {
        this.b = b;
        this.h = h;
    }

    public double getArea() {
        return 0.5 * b * h;
    }
}