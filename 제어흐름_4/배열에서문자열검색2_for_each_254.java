package 교재.제어흐름_4;

public class 배열에서문자열검색2_for_each_254 {
    public static void main(String[] args) {

        String[] cities = {"New York", "Beijing", "Seoul"};

        boolean found = false;
        int index = 0;

        for(String city : cities) { // for each
            if(city.equals("Seoul")) {
                System.out.printf("%d %s\n", index, cities[index]);
                found = true;
                break;
            }
            index++; // Seoul을 찾기위해 다음 인덱스로 넘어감
        }

        if(found == false) {
            System.out.println("Seoul not found");
        }
    }
}
