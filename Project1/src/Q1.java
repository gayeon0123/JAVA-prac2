import java.util.Scanner;

class Sqrt {

    double getDistance(int x1, int x2, int y1, int y2) {
        return Math.sqrt((x2-x1) * (x2-x1) + (y2-y1) * (y2-y1));
    }

    double getArea(double a){
        return Math.sqrt((double)3 / 4) * a * a;
    }
}
public class Q1 {
    public static void main(String[] args) {
    // 이등변 삼각형의 면적 구하기
        
        int x1, x2, y1, y2;
        double a, area;

        Sqrt sq = new Sqrt();

        Scanner scan = new Scanner(System.in);

        System.out.print("T1의 x좌표 입력 : ");
        x1 = scan.nextInt();
        System.out.print("T1의 y좌표 입력 : ");
        y1 = scan.nextInt();

        System.out.print("T2의 x좌표 입력 : ");
        x2 = scan.nextInt();
        System.out.print("T2의 y좌표 입력 : ");
        y2 = scan.nextInt();

        a = sq.getDistance(x1, x2, y1, y2);

        area = sq.getArea(a);

        System.out.println("삼각형의 면적 : " + area);
    }
}
