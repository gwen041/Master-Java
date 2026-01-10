package OOP.Practice02;

public class Main {
    public static void main(String[] args) {
        Student stud1 = new Student(24001, 89, "Bruce");
        Student stud2 = new Student(24012, 96, "Loki");

        stud1.compareGpa(stud2);
    }
    
}
