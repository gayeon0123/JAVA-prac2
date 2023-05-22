package 과제;

import java.util.Scanner;

public class CharNumber_문자횟수 {
    public static void main(String[] args) {

        String txt = "In blandit lacus ac sapien dictum, elementum fringilla sem varius. Vestibulum consectetur metus at felis porttitor, a rhoncus neque consectetur. Integer vehicula felis non metus eleifend, in blandit risus ullamcorper. Phasellus mauris nisi, facilisis et quam placerat, congue venenatis diam. Praesent in erat odio. Phasellus sit amet efficitur sem. Ut quis mi venenatis, feugiat justo eu, rhoncus velit. Suspendisse iaculis tempus sapien. Integer mauris neque, posuere sed mi at, aliquet facilisis nibh. Cras vel blandit lorem. Aliquam suscipit, nisl id condimentum condimentum, purus magna maximus sem, vitae vehicula diam nisi ac enim.";

        Scanner scan = new Scanner(System.in);
        char[] chars = new char[5];

        for(int i = 0; i < 5; i++) {
            System.out.print("문자 한 개를 입력하세요: ");
            chars[i] = scan.next().charAt(0); // 문자 입력받을때: .charAt(0) 붙이기
        }

        int[] counts = {0,0,0,0,0}; // 5개 문자가 나온 횟수를 각각 초기화

        for(int i = 0; i < txt.length(); i++) {
            char ch = txt.charAt(i);
            System.out.print(ch + " ");

            for(int j = 0; i < 5; j++) {
                if(ch == chars[j]) {
                    counts[j]++;
                }
            }
        }

        System.out.println("\n");
        for(int i = 0; i < 5; i++) {
            System.out.printf("%c:%d", chars[i], counts[i]);
        }

    }
}
