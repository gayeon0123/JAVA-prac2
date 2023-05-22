package Traffic;

public class Vehicle {
    private String name;
    private int penaltyMultiplier;
    private int penaltyFactor;

    public Vehicle(String name, int penaltyMultiplier) {
        this.name = name;
        this.penaltyMultiplier = penaltyMultiplier;
    }

    public String getName() {
        return name;
    }

    public int getPenaltyMultiplier() {
        return penaltyMultiplier;
    }

    public int getPenaltyFactor() {
        return penaltyFactor;
    }

    @Override
    public String toString() {
        return name;
    }
}


