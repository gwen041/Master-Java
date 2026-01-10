package EXERCISES.Exercise19;

public class Main {

    public static void main(String[] args) {
        Person person1 = new Person("Franz", 20);
        Person person2 = new Person("Roy");

        System.out.println("The first person name is: " + person1.getName() + " and he is " + person1.getAge() + " years old.");
        System.out.println("The second person name is: " + person2.getName() + " and he is " + person2.getAge() + " years old.");

        person1.printInfo();
        person2.printInfo();


    }
    
}
