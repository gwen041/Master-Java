package OOP.Practice11;

public class Main {
    public static void main(String[] args) {
        Animal bird = new Animal() {
            public void makeSound() {
                System.out.println("Tweet!");
            }
        };

        Animal cat = new Cat();
        Dog dog = new Dog();

        bird.makeSound();
        cat.makeSound();
        dog.makeSound();
    }  
}
