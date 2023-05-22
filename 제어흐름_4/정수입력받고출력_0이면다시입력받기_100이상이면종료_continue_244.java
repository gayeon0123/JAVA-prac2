package 교재.제어흐름_4;

import java.util.Scanner;

public class 정수입력받고출력_0이면다시입력받기_100이상이면종료_continue_244 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num;

        do {
            System.out.print("정수 한 개를 입력하세요. 100이상의 정수가 입력되면 종료됩니다.");
            num = scan.nextInt();

            if (num == 0) {
                continue;
            }else {
                System.out.println(num); // 0이 아니어야 입력결과 출력
            }
        } while (num < 100); // num이 100보다 작으면, 계속반복
    }
}
