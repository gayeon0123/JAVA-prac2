package 교재.제어흐름_4;

import java.util.Scanner;

public class 극장표값_문자열비교_213 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("prime, standard, economy 중 한 가지를 입력하시오: ");
        String zone = scan.next();

        // 문자열 비교 : compareTo(), equals()
        // compareTo() : 문자열이 같으면 0을 반환
        // equals() : true/false 반환
        if(zone.compareTo("prime") == 0) {
            System.out.println("프라임존 표 값은 11000원입니다.");
        }else if(zone.compareTo("standard") == 0) {
            System.out.println("스탠다드존 표 값은 10000원입니다.");
        }else if(zone.compareTo("economy") == 0) {
            System.out.println("이코노미존 표 값은 9000원입니다.");
        }else {
            System.out.println("좌석 종류를 잘못 입력했습니다");
        }
    }
}
