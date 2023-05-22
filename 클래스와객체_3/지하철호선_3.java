package 교재.클래스와객체_3;

class Subway {
    int line;
    void run() {
        System.out.println(line + " line runs");
    }

    void setLine(int l) {
        line = l;
    }
}
public class 지하철호선_3 {
    public static void main(String[] args) {

        Subway sub = new Subway();
        sub.setLine(3);
        sub.run();

    }
}
