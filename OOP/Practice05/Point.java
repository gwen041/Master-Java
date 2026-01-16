package OOP.Practice05;

public class Point {
    private int x, y;
    
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(double x, double y) {
        this.x = (int) x;
        this.y = (int) y;
    }

    public void printVar() {
        System.out.println("Point (x, y): "  + "(" + x + ", " + y + ")");
    }

}
