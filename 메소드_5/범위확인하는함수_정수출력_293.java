package 교재.메소드_5;

import java.util.Scanner;

class PrintNumInRange {
    int value;
    Scanner scanner;

    PrintNumInRange(Scanner scanner) {
        this.scanner = scanner;
    }

    boolean isInRange(int min, int max) {
        return (value >= min && value <= max) ? true : false;
    }

    void printInt() {
        System.out.println(value);
    }

    void readInt() {
        System.out.print("1-100사이의 정수를 입력하세요: ");
        value = scanner.nextInt();
    }
}

public class 범위확인하는함수_정수출력_293 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        PrintNumInRange range = new PrintNumInRange(scan);

        range.readInt();

        if(range.isInRange(1,100)) {
            range.printInt();
        }else {
            System.out.println("범위 밖 정수가 입력되었습니다");
        }
    }

}
