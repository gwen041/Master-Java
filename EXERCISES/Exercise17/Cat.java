package EXERCISES.Exercise17;

public class Cat {
    private String name;
    private String breed;
    private int age;
    

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    
    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public boolean ageChecker() {
        if (this.age > 1) {
            return false;
        }
        return true;
    }
}
