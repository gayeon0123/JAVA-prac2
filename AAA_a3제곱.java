package 실습연습;

public class AAA_a3제곱 {
    public static void main(String[] args) {

        int a = 1;
        int sum = 0;

        System.out.print("sum = ");
        while(true) {
            if(sum > 100) {
                break;
            }
            a++;
            sum += a*a*a;

            if(sum > 100) {
                System.out.println(a*a*a);
            }else {
                System.out.print(a*a*a + "+");
            }
        }
        System.out.println("\n최초로 100을 넘는 정수 a는 " + (a-1) + "입니다.");
        System.out.println("100을 넘는 정수 a까지 양의 정수 a3의 합은 " + sum + "입니다.");
    }
}
