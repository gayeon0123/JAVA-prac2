package 실습연습;

import java.util.Scanner;

public class ChangeString_문자열변경 {

    public static void main(String[] args) {

        String original = "Let's meet in my office at 10";

        System.out.println("다음 문장에서 문자열을 바꾸는 프로그램입니다.");
        System.out.println("원본 문장 : Let's meet in my office at 10");

        Scanner scan = new Scanner(System.in);
        System.out.println("문자열에서 바꾸고 싶은 문자열을 입력하세요:");
        String str = scan.nextLine();
        System.out.println("새로운 문자열을 입력하세요:");
        String strNew = scan.nextLine();

        // indexOf() : () 안의 값의 인덱스 번호 찾기
        int index = original.indexOf(str);

        // substr(0, ) : 0부터 시작해서 몇개를 끊을 것인지
        // substring(시작위치,끝위치+1 ) : (시작위치)부터 시작해서 (끝위치)까지 가져올 것인지
        String result = original.substring(0, index) + strNew + original.substring(index+str.length());
        System.out.println("새로운 문장: " + result);
    }
}

