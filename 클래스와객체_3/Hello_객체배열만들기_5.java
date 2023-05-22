package 교재.클래스와객체_3;

class Hello {
    String toWhom = "world";

    Hello() {

    }

    Hello(String whom) {
        setWhom(whom);
    }

    void setWhom(String whom) {
        toWhom = whom;
    }

    void sayHello() {
        System.out.println("hello" + toWhom);
    }
        }
public class Hello_객체배열만들기_5 {
    public static void main(String[] args) {

        Hello[] helloArray = new Hello[3];

        helloArray[0] = new Hello(" world");
        helloArray[1] = new Hello(" 홍길동");
        helloArray[2] = new Hello(" 허균");

        helloArray[0].sayHello();
        helloArray[1].sayHello();
        helloArray[2].sayHello();
    }
}
