package EXERCISES.Exercise19;

public class Person {
    private String name;
    private int age;

    public Person(String name) {
        this(name, 28);
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void printInfo() {
        System.out.println("Name: " + name + ", " + "Age: " + age);  
    }
  
}
