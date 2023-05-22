package 실습연습;

import java.util.Scanner;

public class DewPoint_이슬점 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("습도 입력 : ");
        double Humid = scan.nextDouble();
        System.out.print("온도 입력 : ");
        double Temp = scan.nextDouble();

        double DewPoint = (243.12 * (Math.log(Humid/100) + (17.62*Temp) / (243.12+Temp))) / (17.62 - (Math.log(Humid/100) + (17.62*Temp) / (243.12+Temp)));
        int DewPointInt = (int) (DewPoint * 10); // 소수점 둘째자리까지를 정수형으로 변환
        double DewPointRounded = DewPointInt / 10.0; // 소수점 첫째자리까지만 나오도록 반올림
        System.out.println(DewPointRounded);
    }
}
