package EXERCISES.Exercise18;

public class Dog {
    private int age;

    public Dog(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }


    public void compareAge (Dog otherDog) {
        if (this.age > otherDog.age) {
            System.out.println("The first dog is older than the second dog");
        } 
        else if (otherDog.age > this.age) {
            System.out.println("The second dog is older than the first dog");
        }
        else {
            System.out.println("The two dogs have the same age");
        }
    }    
}
