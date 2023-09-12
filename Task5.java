
public class Task5 {

    public static void findingHighestScoreAndPosition(int[] scores) {
        int highestScore = -1;
        int position = -1;

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > highestScore) {
                highestScore = scores[i];
                position = i + 1;
            }

        }

        String positionSuffix = Task1And2.numberAndSuffix(position);

        System.out
                .printf("The highest score is " + highestScore + " and belongs to the " + positionSuffix + " student");

    }

}