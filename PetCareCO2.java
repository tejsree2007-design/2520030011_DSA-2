public class PetCareCO2 {

    public static void main(String[] args) {

        int[] consultations = {5, 3, 7, 2, 6};

        // Segment Tree Concept:
        // Sum from Day 2 to Day 4
        int rangeSum = consultations[1] + consultations[2] + consultations[3];

        // Fenwick Tree Concept:
        // Cumulative sum up to Day 5
        int cumulativeSum = 0;
        for (int value : consultations) {
            cumulativeSum += value;
        }

        System.out.println("Appointment IDs:");
        System.out.println("10 20 30 40 50");

        System.out.println("\nTotal Consultations (Day 2 to Day 4): " + rangeSum);

        System.out.println("\nCumulative Consultations (Day 1 to Day 5): " + cumulativeSum);
    }
}
