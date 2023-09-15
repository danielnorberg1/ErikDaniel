public class StudentScoresSubroutines {

    // In this method we promt the user to enter the scores of the students.
    // Which we later call in the "Menu" where the value
    // of the often used parameter "(scoreOfStudent) gets assigned"

    // Here we have made two final integers if the score range of grading system would change etc.
    private static final int HIGHEST_GRADE = 100;
    private static final int LOWEST_GRADE = 0;

    public static void readGrades(int[] position) {

        for (int i = 0; i < position.length; i++) {
            int studentNumber = i + 1;
            System.out.print("Enter the score for the " + formatStudentNumber(studentNumber) + " student ");

            // If the score is outside of the wanted values
            int invalidStudentScores = -1;

            // This whileloop decides if the user input is a valid value or not.
            do {
                invalidStudentScores = IOScanner.readInt();
                IOScanner.readString();

                if (invalidStudentScores < LOWEST_GRADE || invalidStudentScores > HIGHEST_GRADE) {
                    System.out.println("Error - Input out of bound. Score can only be between " + LOWEST_GRADE + " and " + HIGHEST_GRADE + "." );
                    System.out.print("Enter the score for the " + formatStudentNumber(studentNumber) + " student ");
                }
            } while (invalidStudentScores < LOWEST_GRADE || invalidStudentScores > HIGHEST_GRADE);

            position[i] = invalidStudentScores;

        }
        // Here im calling the printing method from method "displayScores"
        System.out.print("Thank you for your input.");
        displayScores(position);

    }

    // This method is fitting the student number with the suffix and returning it to
    // the print.
    public static String formatStudentNumber(int studentNumber) {

        switch (studentNumber % 10) {
            case 1:
                return studentNumber + "st";
            case 2:
                return studentNumber + "nd";
            case 3:
                return studentNumber + "rd";
            default:
                return studentNumber + "th";
        }
    }

    // This method is for printing student scores we later call it in Menu etc
    // where we are using the parametert "(scoreOfStudents)" to get the wanted value
    public static void displayScores(int[] scores) {
        System.out.println(" Your entered scores are:");
        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i]);
            if (i < scores.length - 1) {
                System.out.print(", ");
            }
        }

    }

    // Here is a method for calculating the mean of the studentscores
    // We get the value in the "Menu" when we call the method with the parameter
    // "(scoreOfStudent)"
    public static void calculateMeanOfScores(int[] scores) {
        double meanSum = 0;

        for (int i = 0; i < scores.length; i++) {
            meanSum += scores[i];
        }

        System.out.printf("The mean of the numbers is %.2f%n", meanSum / scores.length);
    }

    // This Method is for finding the highest and lowest score
    public static void findingTwoHighestTwoLowestScore(int[] scores) {

        //Here we declare the virables with the final ints from above
        //Since the highest and lowst score can never be higher or lower than
        // what the program asks for.
        int highest = LOWEST_GRADE;
        int secondHighest = LOWEST_GRADE;
        int lowest = HIGHEST_GRADE;
        int secondLowest = HIGHEST_GRADE;

        // A for-loop finding the highest and lowest "score"
        // To get the values of "score" we later call the method in the "Menu" with with
        // the parameter "(scoreOfStudent)"
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

    // Here we have a method for finding the highest score with it's possition.
    // Like we did in Task4 we call the function with the parameter "(scoreOfStudents)"
    // in the "Menu" to get the values.
    public static void highestScoreAndPosition(int[] scores) {
        int highestScore = -1;
        int position = -1;

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > highestScore) {
                highestScore = scores[i];
                position = i + 1;
            }

        }

        String positionSuffix = formatStudentNumber(position);

        System.out.printf("The highest score is " + highestScore + " and belongs to the " + positionSuffix + " student");

    }

}