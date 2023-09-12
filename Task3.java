
public class Task3 {
    public static void calculateMean(int[] scoreOfStudents) {
        double meanSum = 0;

        for (int score : scoreOfStudents) {
            meanSum += score;
        }

        System.out.printf("The mean of the numbers is %.2f%n", meanSum / scoreOfStudents.length);
    }
}
