package 실습연습.Dice_주사위;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("주사위를 몇 번 던질까요? ");
        int rollCount = scanner.nextInt();

        Dice dice = new Dice();
        DiceProbability diceProbability = new DiceProbability(rollCount);
        diceProbability.rollDice(dice);
        diceProbability.printProbability();

        scanner.close();
    }
}

