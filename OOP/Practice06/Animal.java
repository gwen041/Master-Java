package OOP.Practice06;

public class Animal {
    protected String name = "Coca";
    
    public void makeSound() {
        System.out.println("Animal makes sound.");
    }
}

class Cat extends Animal {

    public void makeSound() {
        System.out.println("Meow!");
    }     
} 