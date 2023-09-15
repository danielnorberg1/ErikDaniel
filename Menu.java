public class Menu {
    private static int[] scoreOfStudents = new int[7];

    public static void main(String[] args) {
        // Here we have the main so called "Menu"
        // where we promt the user through different steps by calling all the necessary methods.
        // Promting the user to enter the scores of the students which get stored in "(scoreOfStudents)".
        StudentScoresSubroutines.readGrades(scoreOfStudents);

        displayMenu();

        int menuOptions = Integer.MIN_VALUE;

        while (menuOptions != 7) {
            menuOptions = IOScanner.readInt();
            IOScanner.readString();

            // Notice this is were we call all the methods.
            // Also notice that this is where we use the result of "scoreOfStudents"
            switch (menuOptions) {
                case 1:
                    StudentScoresSubroutines.readGrades(scoreOfStudents);
                    displayMenu();
                    break;
                case 2:
                    StudentScoresSubroutines.displayScores(scoreOfStudents);
                    displayMenu();
                    break;
                case 3:
                    StudentScoresSubroutines.calculateMeanOfScores(scoreOfStudents);
                    displayMenu();
                    break;
                case 4:
                    StudentScoresSubroutines.findingTwoHighestTwoLowestScore(scoreOfStudents);
                    displayMenu();
                    break;
                case 5:
                    StudentScoresSubroutines.highestScoreAndPosition(scoreOfStudents);
                    displayMenu();
                    break;
                case 6:
                    CollectingHashtags.collectHashtags();
                    displayMenu();
                    break;
                case 7:
                    System.out.println("\n" + "Thank you for using our grading system. Have a nice day!\n");
                    break;
                default:
                    System.out.println("Error - Invalid value. Please type between 1 and 7\n");
                    displayMenu();
                    break;
            }
        }

        IOScanner.closeScanner();
    }

    // Another printing method to minimize the output of the "displayMenu"
    public static void displayMenu() {
        System.out.print("\n" +
                "Welcome to the menu. Choose one of the options below:\n" +
                "1. Register new scores for students.\n" +
                "2. Print all registered grades.\n" +
                "3. Calculate the mean of the entered scores.\n" +
                "4. Find the two highest and two lowest scores.\n" +
                "5. Find the highest score and its position.\n" +
                "6. Collect hashtags from a post.\n" +
                "7. To exit.\n" +
                "\n" +
                "Type your option: ");

    }

}
