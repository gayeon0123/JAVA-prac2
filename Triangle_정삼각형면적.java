package 과제;

import java.util.Scanner;

public class Triangle_정삼각형면적 {
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

        double a = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
        double area = Math.sqrt(3) * a * a / 4;

        System.out.printf("정삼각형의 면적 : %f", area);
    }
}
