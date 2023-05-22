package 교재.자료형_연산자_입력_2;

import java.util.Scanner;

public class 온도변환_5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("화씨 온도 입력 : ");
        float fahrenheit = scan.nextFloat();

        float celsius = ((float)5/9) * (fahrenheit - 32); // 타입 변환 (int -> float)
        System.out.printf("화씨 %.2f도는 섭씨 %.2f도 입니다.", fahrenheit, celsius);
    }
}
