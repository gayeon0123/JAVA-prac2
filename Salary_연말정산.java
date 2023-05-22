package 과제;

import java.util.Scanner;

public class Salary_연말정산 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("근로 소득 입력 : ");
        int income = scan.nextInt();

        System.out.print("문화비 사용 금액 입력 : ");
        int cultureCost = scan.nextInt();

        System.out.print("신용카드 사용 금액 입력 : ");
        int creditCost = scan.nextInt();

        System.out.print("전통시장 사용 금액 입력 : ");
        int marketCost = scan.nextInt();

        System.out.print("교통비 사용 금액 입력 : ");
        int trafficCost = scan.nextInt();

        System.out.print("현금영수증 금액 입력 : ");
        int receiptCost = scan.nextInt();

        double creditCostDeduction = 0.0;
        double cultureCostDeduction = 0.0;
        double marketCostDeduction = 0.0;
        double trafficCostDeduction = 0.0;

        int sumCredit = creditCost + receiptCost + marketCost + cultureCost;
        int newSalary = income; // newSalary : 세금 공제한 금액

        if (income <= 70000000) {
            cultureCostDeduction = cultureCost * 0.3;

            if (cultureCostDeduction > 1000000) {
                cultureCostDeduction = 1000000;
            }
            newSalary -= cultureCostDeduction;
        }

        if (sumCredit > income * 0.25) {
            newSalary -= (sumCredit - income * 0.25) * 0.15;
        }
        newSalary -= (marketCost + trafficCost) * 0.3;

        double tax;

        if(newSalary <= 14000000) {
            tax = newSalary * 0.06;
        }else if(newSalary <= 50000000) {
            tax = newSalary * 0.15 - 1260000;
        }else if(newSalary <= 88000000) {
            tax = newSalary * 0.24 - 5760000;
        }else if(newSalary <= 150000000) {
            tax = newSalary * 0.35 - 15440000;
        }else if(newSalary <= 300000000) {
            tax = newSalary * 0.38 - 19940000;
        }else {
            tax = newSalary * 0.4 - 25940000;
        }

        System.out.printf("소득세는 %f원 입니다.", tax);
    }
}

