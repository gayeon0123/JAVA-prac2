package 실습연습.StudnetData_학생데이터;

public class Student {

    private String name;
    private int number;
    private double gpa;

    public Student(String name, int number, double gpa) {
        this.name = name;
        this.number = number;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public double getGPA() {
        return gpa;
    }

    public String toString() {
        return "Name: " + name + ",Number: " + number + ", GPA" + gpa;
    }
}
