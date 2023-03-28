// 주차 요금 계산

// 골드회원
// 2시간 무료

// 실버회원
// 구매 만원 이상 1시간 무료
// 구매 3만원 이상 2시간 무료

// 회원 등급과 관계없이 무료 시간 초과시 10분당 1000원

import java.util.Scanner;

public class Q2_2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("회원 등급 : ");
        String membership = scan.next();

        System.out.print("주차 시간(분) : ");
        int parkingTime = scan.nextInt();

        int parkingFee = 0;

        if(membership.equals("플래티넘") || membership.equals("골드")) {
            if(parkingTime > 120) {
                parkingFee = (parkingTime - 120) / 10 * 1000;
            }else {
                parkingFee = 0;
                System.out.println("무료\n");
            }

        }else if (membership.equals("실버") || membership.equals("프렌즈")) {

            System.out.print("구매 금액 : ");
            int purchased = scan.nextInt();

            if(purchased >= 30000) {
                if(parkingTime <= 120) {
                    parkingFee = 0;
                    System.out.println("무료\n");

                }else {
                    parkingFee = (parkingTime - 120) / 10 * 1000;
                }
            }else if (purchased >= 10000) {
                if(parkingTime <= 60) {
                    parkingFee = 0;
                    System.out.println("무료\n");

                }else {
                    parkingFee = (parkingTime - 60) / 10 * 1000;
                }
            }
        }else if (membership.equals("비회원")) {

            System.out.print("구매 금액 : ");
            int purchased = scan.nextInt();

            if(purchased >= 50000 && parkingTime <= 120) {
                parkingFee = 0;
                System.out.println("무료\n");

            }else if(purchased >= 50000 && parkingTime > 120){
                parkingFee = (parkingTime - 120) / 10 * 1000;

            }else if (purchased >= 30000 && parkingTime <= 60) {
                parkingFee = 0;
                System.out.println("무료\n");

            }else {
                parkingFee = (parkingTime - 60) / 10 * 1000;
            }

        }else {
            System.out.println("잘못된 회원등급 입니다.");
        }

        System.out.printf("주차 요금은 %d원 입니다.", parkingFee);
    }
}
