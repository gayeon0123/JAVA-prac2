package 교재.클래스와객체_3;

class Coffee {
    String origin;
    int degreeOfRoast;
    int grade;

    Coffee(String o) {
        origin = o;
    }

    public void roast() {
        System.out.println("roasting..." + origin);
    }

    public void grind() {
        System.out.println("grinding..." + origin);
    }

    public void brew() {
        System.out.println("brewing..." + origin);
    }
}
public class 객체생성_커피원산지지정_4 {

    public static void main(String[] args) {

        Coffee coffee = new Coffee("Brazil");
        coffee.roast();
        coffee.grind();
        coffee.brew();
    }
}
