package 교재.제어흐름_4;

import java.util.Scanner;

public class 정수입력받고출력_0을입력하면종료_break_238 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num;

        do{
            System.out.print("정수 한 개를 입력. 0이 입력되면 종료됩니다.");
            num = scan.nextInt();

            // 0인지 확인
            if(num != 0) {
                System.out.println(num);
            }else {
                break;
            }
        }while(true); // 조건문이 true이면, 계속반복
    }
}
