package 실습연습.StudnetData_학생데이터;

public class StudentDB {

    private Student[] students;
    public static final int LOWER_THAN = 0; // 정적 상수로 지정
    public static final int HIGHER_THAN = 1; // 정적 상수로 지정

    public StudentDB(int size) {
        students = new Student[size];
    }

    public void add(Student student) {
        for(int i = 0; i < students.length; i++) {
            students[i] = student;
            break;
        }
    }

    public Student findBy(String name) {
        for(Student student : students) {
            if(student != null && student.getName().equals(name)) { // name이 같으면
                return student;
            }
        }
        return null;
    }

    public Student findBy(int number) {
        for(Student student : students) {
            if(student != null && student.getNumber() == number) { // number이 같으면
                return student;
            }
        }
        return null;
    }

    public Student findBy(double gpa) {
        for(Student student : students) {
            if(student != null && student.getGPA() == gpa) { // gpa이 같으면
                return student;
            }
        }
        return null;
    }

    public Student findBy(int param, double gpa) {
        if(param == LOWER_THAN) {
            for(Student student : students) {
                if(student != null && student.getGPA() < gpa) { // gpa보다 낮은 평점의 학생 정보 반환
                    return student;
                }
            }
        }else if (param == HIGHER_THAN) {
            for(Student student : students) {
                if(student != null && student.getGPA() > gpa) { // gpa보다 높은 평점의 학생 정보 반환
                    return student;
                }
            }
        }
        return null;
    }

}
