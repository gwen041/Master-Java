package OOP.Practice08;

public class Car {

    void startEngine() {

        class Engine {

            public void run() {
                System.out.println("Engine is running");
            }
        }
        Engine eng = new Engine();
        eng.run();
    }
}