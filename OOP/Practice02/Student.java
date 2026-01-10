package OOP.Practice02;

public class Student {
    private int studentId, grade;
    private String studentName;

    public Student(int studentId, int grade, String studentName) {
        this.studentId = studentId;
        this.grade = grade;
        this.studentName = studentName;
    }

    public int getStudId() {
        return studentId;
    }

    public int getGrade() {
        return grade;
    }

    public String getStudName() {
        return studentName;
    }

    public void compareGpa(Student stud2) {
        if (this.grade > stud2.grade) {
            System.out.println(this.studentName + " (" + this.grade + ") " + "got better grades compare to " + stud2.studentName + " (" + stud2.grade + ")");
        }
        else if (stud2.grade > this.grade) {
             System.out.println(stud2.studentName + " (" + stud2.grade + ") " + "got better grades compare to " + this.studentName + " (" + this.grade + ")");
        } 
        else {
            System.out.println("Both students have a " + this.grade + " grade");
        }

    }
    
}

    // Write a Java program where the "Student" class supports a method to determine if the student passed based on grades.
    // Write a Java program where the "Student" class includes a method to compare two students' GPAs.
