package Traffic;

public class Violation {
    private String name;
    private int penalty;

    public Violation(String name, int penalty) {
        this.name = name;
        this.penalty = penalty;
    }

    public String getName() {
        return name;
    }

    public int getPenalty() {
        return penalty;
    }

    @Override
    public String toString() {
        return name;
    }
}

