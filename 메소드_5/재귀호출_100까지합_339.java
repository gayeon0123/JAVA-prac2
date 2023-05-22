package 교재.메소드_5;

class RecursiveSum {
    long sum(int n) {
        if(n == 1) {
            return 1;
        }else {
            return n + sum(n-1); // n + (n-1)까지의 합 = n까지의 합
        }
    }
}
public class 재귀호출_100까지합_339 {
    public static void main(String[] args) {

        RecursiveSum sum = new RecursiveSum();

        System.out.println(sum.sum(100));
    }
}
