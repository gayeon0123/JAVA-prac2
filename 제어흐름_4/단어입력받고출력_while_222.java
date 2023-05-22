package 교재.제어흐름_4;

import java.util.Scanner;

public class 단어입력받고출력_while_222 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("단어 입력. quit을 입력하면 종료됨: ");
        String word = scan.next();

        while(!word.equals("quit")) {
            System.out.println(word);
            System.out.print("단어 입력. quit을 입력하면 종료됨: ");
            word = scan.next();
        }

    }

}
