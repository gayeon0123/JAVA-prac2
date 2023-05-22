package 교재.메소드_5;

class Sum1 {
    int sum = 0;

    int getSum() {
        return sum;
    }
    int add(int num) {
        if(num <= 50) { // num <= 50 : 아무것도 안함
            return sum;
        }else if (num > 100) { // num > 100 : 멤버변수의 값에 num을 더함
            sum += num;
        }
        printSum(); // num > 100, 50<num<=100 두 조건 모두 해당됨
        return sum; // 50보다 크고 100보다 작거나 같으면 : 현재 멤버변수 값 반환

    }

    void printSum() {
        System.out.println(getSum());
    }

}

public class 숫자범위에따라_다른일하기_301 {
    public static void main(String[] args) {

        Sum1 s = new Sum1();

        s.add(101);
        s.add(51);
        s.add(50);
        s.printSum();
    }
}
