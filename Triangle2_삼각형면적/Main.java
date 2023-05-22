package 과제.Triangle2_삼각형면적;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("x1 입력 : ");
        int x1 = scan.nextInt();
        System.out.print("y1 입력 : ");
        int y1 = scan.nextInt();
        System.out.print("x2 입력 : ");
        int x2 = scan.nextInt();
        System.out.print("y2 입력 : ");
        int y2 = scan.nextInt();

        EquilateralTriangle triangle = new EquilateralTriangle();
        triangle.x1 = x1;
        triangle.x2 = x2;
        triangle.y1 = y1;
        triangle.y2 = y2;

        System.out.printf("정삼각형의 면적 : %f", triangle.getDistance());
    }
}
