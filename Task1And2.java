public class Task1And2 {

    // Here we have task number 1
    public static void taskNumberOne(int[] scoreOfStudents) {

        for (int i = 0; i < scoreOfStudents.length; i++) {
            int studentNumber = i + 1;
            System.out.print("Enter the score for the " + numberAndSuffix(studentNumber) + " student ");

            // If the score is outside
            int scoreInCaseOf = 0;
            boolean inputValidation = false;

            // This whileloop decides if the user input is a valid value or not.
            while (!inputValidation) {
                scoreInCaseOf = IOScanner.readInt();
                if (scoreInCaseOf <= 100 && scoreInCaseOf >= 0) {
                    inputValidation = true;
                } else {
                    System.out.println("Error - Input out of bound. Score can only be between 0 and 100.");
                    System.out.print("Enter the score for the " + numberAndSuffix(studentNumber) + " student ");
                }
            }
            scoreOfStudents[i] = scoreInCaseOf;

        }
        // Here im calling the printing method
        System.out.print("Thank you for your input.");
        taskNumberTwo(scoreOfStudents);

    }

    // This method is fitting the student number with the suffix and returning it to
    // the print.
    public static String numberAndSuffix(int studentNumber) {

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

    // Method for printing
    public static void taskNumberTwo(int[] scores) {
        System.out.println(" Your entered scores are:");
        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i]);
            if (i < scores.length - 1) {
                System.out.print(", ");
            }
        }

    }
}