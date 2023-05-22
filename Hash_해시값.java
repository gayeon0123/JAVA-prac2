package 실습연습;

import java.util.Scanner;

public class Hash_해시값 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        char[] s = new char[5];
        int n = s.length;

        System.out.print("문자 다섯 개를 한 줄에 한 개씩 입력하세요\n");

        System.out.print("첫번째 문자 입력 : ");
        s[0] = scan.next().charAt(0);
        System.out.print("두번째 문자 입력 : ");
        s[1] = scan.next().charAt(0);
        System.out.print("세번째 문자 입력 : ");
        s[2] = scan.next().charAt(0);
        System.out.print("네번째 문자 입력 : ");
        s[3] = scan.next().charAt(0);
        System.out.print("다섯번째 문자 입력 : ");
        s[4] = scan.next().charAt(0);

        double hash = 0;
        hash = s[0] * Math.pow(31,4) + s[1] * Math.pow(31,3) + s[2] * Math.pow(31,2) + s[3] * Math.pow(31,1) + s[4] * Math.pow(31,0);

        double hashValue = (double) hash;
        System.out.printf("문자열 %c%c%c%c%c의 해시 값은 %.2f입니다.", s[0],s[1],s[2],s[3],s[4],hashValue);
    }
}
