package 교재.제어흐름_4;

public class 배열에서문자열검색1_for_254 {
    public static void main(String[] args) {

        String[] cities = {"New York", "Beijing", "Seoul"};

        boolean found = false;

        for(int i = 0; i < cities.length; i++) {
            if(cities[i].equals("Seoul")) {
                System.out.printf("%d %s\n", i, cities[i]);
                found = true;
                break;
            }
        }
        if(found == false) {
            System.out.println("Seoul not found");
        }
    }
}
