package 교재.제어흐름_4;

class Student {
    String name;
    double gpa;
    int incomeLevel;

    public Student(String name, double gpa, int incomeLevel) {
        this.name = name;
        this.gpa = gpa;
        this.incomeLevel = incomeLevel;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    public int getIncomeLevel() {
        return incomeLevel;
    }

}

public class 장학생선발_204 {
    public static void main(String[] args) {

        Student s1 = new Student("김규상", 4.1, 3);
        Student s2 = new Student("김민재", 3.71, 5);
        Student s3 = new Student("김용하", 3.93, 7);

        if(s1.getGpa() >= 3.5 && s1.getIncomeLevel() <= 5) {
            System.out.printf("%s 학생은 장학생 후보입니다\n", s1.getName());
        }
        if(s2.getGpa() >= 3.5 && s2.getIncomeLevel() <= 5) {
            System.out.printf("%s 학생은 장학생 후보입니다\n", s2.getName());
        }
        if(s3.getGpa() >= 3.5 && s3.getIncomeLevel() <= 5) {
            System.out.printf("%s 학생은 장학생 후보입니다\n", s3.getName());
        }

    }
}
