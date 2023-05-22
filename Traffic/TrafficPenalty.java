package Traffic;

import java.util.*;

public class TrafficPenalty {

    private static final Violation[] VIOLATIONS = {
            new Violation("SPEED_LIMIT_EXCEEDED", 8),
            new Violation("SIGNAL_VIOLATION", 0),
            new Violation("CENTER_LINE_VIOLATION", 0),
            new Violation("BUS_LANE_VIOLATION", 0)
    };

    private static final Vehicle[] VEHICLES = {
            new Vehicle("MOTORCYCLE", 1),
            new Vehicle("PASSENGER_CAR", 1),
            new Vehicle("BUS", 1)
    };

    public static void main(String[] args) {

        // Case 1: SPEED_LIMIT_EXCEEDED + MOTORCYCLE
        int penalty1 = calculatePenalty(VIOLATIONS[0], VEHICLES[0]);
        System.out.println("Case 1 - SPEED_LIMIT_EXCEEDED + MOTORCYCLE: " + penalty1 + "원");

        // Case 2: SIGNAL_VIOLATION + CENTER_LINE_VIOLATION + PASSENGER_CAR
        int penalty2 = calculatePenalty(VIOLATIONS[1], VEHICLES[1]) +
                calculatePenalty(VIOLATIONS[2], VEHICLES[1]);
        System.out.println("Case 2 - SIGNAL_VIOLATION + CENTER_LINE_VIOLATION + PASSENGER_CAR: " + penalty2 + "원");

        // Case 3: BUS_LANE_VIOLATION + SPEED_LIMIT_EXCEEDED + BUS
        int penalty3 = calculatePenalty(VIOLATIONS[3], VEHICLES[2]) +
                calculatePenalty(VIOLATIONS[0], VEHICLES[2]);
        System.out.println("Case 3 - BUS_LANE_VIOLATION + SPEED_LIMIT_EXCEEDED + BUS: " + penalty3 + "원");

        // Random 10 cases
        int totalPenalty = 0;
        for (int i = 1; i <= 10; i++) {
            // Generate a random violation and vehicle
            Random rand = new Random();
            Violation violation = VIOLATIONS[rand.nextInt(VIOLATIONS.length)];
            Vehicle vehicle = VEHICLES[rand.nextInt(VEHICLES.length)];
            // Calculate penalty
            int penalty = calculatePenalty(violation, vehicle);
            System.out.println("Case " + (i + 3) + " - " + violation.getName() + " + " + vehicle.getName() + ": " + penalty + "원");
            // Add to total penalty
            totalPenalty += penalty;
        }
        System.out.println("Total penalty for random cases: " + totalPenalty + "원");
    }

    private static int calculatePenalty(Violation violation, Vehicle vehicle) {
        int penalty = violation.getPenalty() * vehicle.getPenaltyFactor();
        return penalty;
    }

}


/*package Traffic;

import java.util.*;

public class TrafficPenalty {

    enum Violation {
        SPEED_LIMIT_EXCEEDED,
        SIGNAL_VIOLATION,
        CENTER_LINE_VIOLATION,
        BUS_LANE_VIOLATION
    }

    enum Vehicle {
        MOTORCYCLE,
        PASSENGER_CAR,
        BUS
    }

    public static void main(String[] args) {

        // Case 1: SPEED_LIMIT_EXCEEDED + MOTORCYCLE
        int penalty1 = calculatePenalty(Violation.SPEED_LIMIT_EXCEEDED, Vehicle.MOTORCYCLE);
        System.out.println("Case 1 - SPEED_LIMIT_EXCEEDED + MOTORCYCLE: " + penalty1 + "원");

        // Case 2: SIGNAL_VIOLATION + CENTER_LINE_VIOLATION + PASSENGER_CAR
        int penalty2 = calculatePenalty(Violation.SIGNAL_VIOLATION, Vehicle.PASSENGER_CAR) +
                calculatePenalty(Violation.CENTER_LINE_VIOLATION, Vehicle.PASSENGER_CAR);
        System.out.println("Case 2 - SIGNAL_VIOLATION + CENTER_LINE_VIOLATION + PASSENGER_CAR: " + penalty2 + "원");

        // Case 3: BUS_LANE_VIOLATION + SPEED_LIMIT_EXCEEDED + BUS
        int penalty3 = calculatePenalty(Violation.BUS_LANE_VIOLATION, Vehicle.BUS) +
                calculatePenalty(Violation.SPEED_LIMIT_EXCEEDED, Vehicle.BUS);
        System.out.println("Case 3 - BUS_LANE_VIOLATION + SPEED_LIMIT_EXCEEDED + BUS: " + penalty3 + "원");

        // Random 10 cases
        int totalPenalty = 0;
        for (int i = 1; i <= 10; i++) {
            Violation violation = getRandomViolation();
            Vehicle vehicle = getRandomVehicle();
            int penalty = calculatePenalty(violation, vehicle);
            System.out.println("Random Case " + i + " - " + violation + " + " + vehicle + ": " + penalty + "원");
            totalPenalty += penalty;
        }
        System.out.println("Total Penalty for 10 random cases: " + totalPenalty + "원");
    }

    public static int calculatePenalty(Violation violation, Vehicle vehicle) {
        int penalty = 0;
        switch (violation) {
            case SPEED_LIMIT_EXCEEDED:
                switch (vehicle) {
                    case MOTORCYCLE:
                        penalty = 8;
                        break;
                    case PASSENGER_CAR:
                        penalty = 11;
                        break;
                    case BUS:
                        penalty = 14;
                        break;
                }
                break;
            case SIGNAL_VIOLATION:
                switch (vehicle) {
                    case MOTORCYCLE:
                        penalty = 0;
                        break;
                    case PASSENGER_CAR:
                        penalty = 8;
                        break;
                    case BUS:
                        penalty = 9;
                        break;
                }
                break;
            case CENTER_LINE_VIOLATION:
                switch (vehicle) {
                    case MOTORCYCLE:
                        penalty = 0;
                        break;
                    case PASSENGER_CAR:
                        penalty = 8;
                        break;
                    case BUS:
                        penalty = 9;
                        break;
                }
                break;
            case BUS_LANE_VIOLATION:
                switch (vehicle) {
                    case MOTORCYCLE:
                        penalty = 0;
                        break;
                    case PASSENGER_CAR:
                        penalty = 12;
                        break;
                    case BUS:
                        penalty = 15;
                        break;
                }
                break;
        }
        return penalty;
    }

    public static Violation getRandomViolation() {
        Random random = new Random();
        return Violation.values()[random.nextInt(Violation.values().length)];
    }

    public static Vehicle getRandomVehicle() {
        Random random = new Random();
        return Vehicle.values()[random.nextInt(Vehicle.values().length)];
    }
}
*/