package 과제;

import java.util.Scanner;

public class Contains_Split_문자포함하는단어찾기 {
    public static void main(String[] args) {

        String txt = "In blandit lacus ac sapien dictum, elementum fringilla sem varius. Vestibulum consectetur metus at felis porttitor, a rhoncus neque consectetur. Integer vehicula felis non metus eleifend, in blandit risus ullamcorper. Phasellus mauris nisi, facilisis et quam placerat, congue venenatis diam. Praesent in erat odio. Phasellus sit amet efficitur sem. Ut quis mi venenatis, feugiat justo eu, rhoncus velit. Suspendisse iaculis tempus sapien. Integer mauris neque, posuere sed mi at, aliquet facilisis nibh. Cras vel blandit lorem. Aliquam suscipit, nisl id condimentum condimentum, purus magna maximus sem, vitae vehicula diam nisi ac enim.";

        Scanner scan = new Scanner(System.in);
        char[] chars = new char[5];

        for(int i = 0; i < 5; i++) {
            System.out.print("문자 한 개를 입력하세요: ");
            chars[i] = scan.next().charAt(0); // 문자 입력받을때: .charAt(0) 붙이기
        }

        String[] words = txt.split(" ");

        for(int i = 0; i < words.length; i++) {

            for(int j = 0; i < 5; j++) {
                if(words[i].contains(chars[j] + "")) {
                    System.out.println(words[i]);
                    break; // 한 개 이상의 글자만 있으면 단어 출력하고 나머지 글자는 찾을 필요 없음
                }
            }
        }
    }
}
