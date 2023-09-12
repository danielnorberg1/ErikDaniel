public class Task4 {
    public static void highestLowest(int[] scores) {

        int highest = 0;
        int secondHighest = 0;
        int lowest = 100;
        int secondLowest = 100;

        for (int i = 0; i < scores.length; i++) {
            int score = scores[i];

            if (score < lowest) {
                secondLowest = lowest;
                lowest = score;
            } else if (score < secondLowest || score == lowest) {
                secondLowest = score;
            }
            if (score > highest) {
                secondHighest = highest;
                highest = score;
            } else if (score > secondHighest || score == highest) {
                secondHighest = score;
            }

        }
        System.out.println("The two lowest scores provided are " + lowest + ", and " + secondLowest);
        System.out.println("The two highest scores provided are " + highest + ", and " + secondHighest);

    }
}