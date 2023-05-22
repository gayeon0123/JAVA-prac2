package 교재.제어흐름_4;

import java.util.Scanner;

public class 사용자가0을입력할때까지_정수입력받고출력_do_while_226 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num;

        do{
            System.out.print("정수 한 개를 입력. 0이 입력되면 종료됩니다.");
            num = scan.nextInt();
            System.out.println(num);
        }while(num != 0); // while(반복할 조건); : num이 0이 아니면, 계속반복함
    }
}
