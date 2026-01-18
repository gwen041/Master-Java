package OOP.Practice07;

public class Computer {
    private String name = "Acer";

    class Processor {
        private String brand = "Intel";
        private double speed = 2.5;

        public void printDetails() {
            System.out.println("Computer: " + name);
            System.out.println("Processor brand: " + brand + "\n" + "Speed: " + speed);
        }
    }
}