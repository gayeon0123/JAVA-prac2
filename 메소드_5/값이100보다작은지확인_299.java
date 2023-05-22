package 교재.메소드_5;

class Less {
    boolean Less(int num) {
        return (num < 100) ? true : false;
    }
}

public class 값이100보다작은지확인_299 {
    public static void main(String[] args) {

        Less less = new Less();

        System.out.println(less.Less(50));
        System.out.println(less.Less(100));
        System.out.println(less.Less(150));
    }
}
