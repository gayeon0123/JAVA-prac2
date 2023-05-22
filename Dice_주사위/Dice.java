package 실습연습.Dice_주사위;

public class Dice {
    private int value;

    public int roll() {
        // Math.floor() : 어떤 수보다 크지 않은 최대의 정수를 반환
        this.value = (int)(Math.floor(Math.random() * 6) + 1);
        return this.value;
    }

    public int getValue() {
        return this.value;
    }
}

