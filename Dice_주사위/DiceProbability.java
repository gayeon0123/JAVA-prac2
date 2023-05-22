package 실습연습.Dice_주사위;

public class DiceProbability {
    private int rollCount;
    private int[] diceNum;
    private int[] diceNumCount;
    private double[] diceNumProbability;

    public DiceProbability(int rollCount) {
        this.rollCount = rollCount;
        this.diceNum = new int[rollCount];
        this.diceNumCount = new int[6];
        this.diceNumProbability = new double[6];
    }

    public void calcProbability() {
        if (this.diceNum == null) {
            return;
        }
        for (int i = 0; i < this.rollCount; i++) {
            int num = this.diceNum[i];
            this.diceNumCount[num - 1]++;
        }
        for (int i = 0; i < 6; i++) {
            this.diceNumProbability[i] = ((double)this.diceNumCount[i]) / this.rollCount;
        }
    }

    public void printProbability() {
        if (this.diceNum == null) {
            return;
        }
        for (int i = 0; i < 6; i++) {
            System.out.printf("%d: %.2f%%\n", i + 1, this.diceNumProbability[i] * 100);
        }
    }

    public void rollDice(Dice dice) {
        for (int i = 0; i < this.rollCount; i++) {
            int num = dice.roll();
            this.diceNum[i] = num;
        }
        this.calcProbability();
    }
}

