package 교재.클래스들_메소드_final변수_6;

class Circle {
    static final double PI_VALUE = Math.PI; // 선언과 동시에 초기값 부여
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double calcArea() { // 원의 넓이 계산 함수
        return radius * radius * PI_VALUE;
    }

    double calcPerameter() { // 원의 둘레 계산 함수
        return 2 * radius * PI_VALUE;
    }
}

public class Static_final_원의넓이와둘레계산_383 {
    public static void main(String[] args) {

        Circle circle = new Circle(5);
        System.out.printf("Area = %f\n", circle.calcArea());
        System.out.printf("Perameter = %f\n", circle.calcPerameter());

    }
}
