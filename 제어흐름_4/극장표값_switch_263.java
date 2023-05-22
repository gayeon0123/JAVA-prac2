package 교재.제어흐름_4;

import java.util.Scanner;

public class 극장표값_switch_263 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("prime, standard, economy 중 한 가지를 입력하시오: ");
        String zone = scan.next();

        switch(zone) {
            case "prime" :
                System.out.println("프라임존 표 값은 11000원입니다.");
                break;

            case "standard" :
                System.out.println("스탠다드존 표 값은 10000원입니다.");
                break;

            case "economy" :
                System.out.println("이코노미존 표 값은 9000원입니다.");
                break;

            default :
                System.out.println("좌석 종류를 잘못 입력했습니다");
                break;
        }
    }
}
