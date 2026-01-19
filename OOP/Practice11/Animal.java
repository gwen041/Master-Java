package OOP.Practice11;

abstract class Animal {
    abstract void makeSound(); 
}

class Cat extends Animal {
    public void makeSound() {
        System.out.println("Meow!");
    }
}

class Dog extends Animal {
    public void makeSound() {
        System.out.println("Woof!");
    }
}