package 교재.제어흐름_4;


import java.util.Scanner;

public class 약수인지확인_208 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("정수 2 개를 순차적으로 입력하세요: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        if(num2 % num1 == 0) { // % : 나머지값
            System.out.printf("%d은(는) %d의 약수입니다.", num1, num2);
        }else {
            System.out.printf("%d은(는) %d의 약수가 아닙니다.", num1, num2);
        }
    }
}
