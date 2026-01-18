package OOP.Practice06;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal cat = new Cat();

        animal.makeSound();
        cat.makeSound();

        System.out.println(cat.name);


    }
    
}
