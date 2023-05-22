package 실습연습.StudnetData_학생데이터;

public class Main {
    public static void main(String[] args) {

        StudentDB db = new StudentDB(3);

        Student student1 = new Student("김지우", 20191111, 4.01);
        db.add(student1);

        db.add(new Student("이민준", 20192222, 3.85));
        db.add(new Student("박서윤", 20193333, 3.90));

        System.out.println(db.findBy("김지우"));
        System.out.println(db.findBy(20192222));
        System.out.println(db.findBy(3.90));

        System.out.println(db.findBy(StudentDB.LOWER_THAN, 3.95));
        System.out.println(db.findBy(StudentDB.HIGHER_THAN, 3.95));
    }

}
