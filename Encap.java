class Student {
    private int rollNumber;
    private String name;
    private double marks;
    public int getRollNumber() {
        return rollNumber;
    }
    public String getName() {
        return name;
    }
    public double getMarks() {
        return marks;
    }
    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setMarks(double marks) {
        this.marks = marks;
    }
}
class School {
    private Student[] students;
    public School(Student[] students) {
        this.students = students;
    }
    public void displayStudentDetails() {
        for (Student student : students) {
            System.out.println("Roll Number: " + student.getRollNumber());
            System.out.println("Name: " + student.getName());
            System.out.println("Marks: " + student.getMarks());
        }
    }
}
class BankAccount {
    private double balance;
    public BankAccount(double balance) {
        if (balance < 1000) {
            throw new IllegalArgumentException("Insufficient balance");
        }
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
    }
}
public class Encap {
    public static void main(String[] args) {
        Student[] students = new Student[2];
        students[0] = new Student();
        students[0].setRollNumber(1);
        students[0].setName("Alice");
        students[0].setMarks(90);
        students[1] = new Student();
        students[1].setRollNumber(2);
        students[1].setName("Bob");
        students[1].setMarks(85);
        School school = new School(students);
        school.displayStudentDetails();
        try {
            BankAccount account = new BankAccount(500);
            System.out.println("Balance: " + account.getBalance());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}