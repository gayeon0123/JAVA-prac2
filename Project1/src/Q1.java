// 정삼각형의 면적 구하기

import java.util.Scanner;

class EquilateralTriangle {

    double getDistance(int x1, int x2, int y1, int y2) {
        
        return Math.sqrt((x2-x1) * (x2-x1) + (y2-y1) * (y2-y1));
    }

    double getArea(double a){
        
        return Math.sqrt(3.0) / 4.0 * a * a;
    }
}
public class Q1 {
    public static void main(String[] args) {
        
        int x1, x2, y1, y2;
        double a, area;

        EquilateralTriangle eq = new EquilateralTriangle();

        Scanner scan = new Scanner(System.in);

        System.out.print("T1의 x좌표 입력 : ");
        x1 = scan.nextInt();
        System.out.print("T1의 y좌표 입력 : ");
        y1 = scan.nextInt();

        System.out.print("T2의 x좌표 입력 : ");
        x2 = scan.nextInt();
        System.out.print("T2의 y좌표 입력 : ");
        y2 = scan.nextInt();

        a = eq.getDistance(x1, x2, y1, y2);

        area = eq.getArea(a);

        System.out.println("정삼각형의 면적 : " + area);
    }
}
