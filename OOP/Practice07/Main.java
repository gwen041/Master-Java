package OOP.Practice07;

public class Main {
    public static void main(String[] args) {
        Computer comp = new Computer();
        Computer.Processor proc = comp.new Processor();

        proc.printDetails();
    }   
}