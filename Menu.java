public class Menu {
    private static int[] scoreOfStudents = new int[7];

    public static void main(String[] args) {

        // Promting the user to enter the scores of the students.
        Task1And2.taskNumberOne(scoreOfStudents);

            displayMenu();

            int menuOptions = Integer.MIN_VALUE;
            String rebootMessage = "Welcome to the menu. Choose one of the options below:";

            while (menuOptions != 7) {
                menuOptions = IOScanner.readInt();

                switch (menuOptions) {
                    case 1:
                        Task1And2.taskNumberOne(scoreOfStudents);
                        System.out.printf(rebootMessage);
                        displayMenu();
                        break;
                    case 2:
                        Task1And2.taskNumberTwo(scoreOfStudents);
                        displayMenu();
                        break;
                    case 3:
                        Task3.calculateMean(scoreOfStudents);
                        displayMenu();
                        break;
                    case 4:
                        Task4.highestLowest(scoreOfStudents);
                        displayMenu();
                        break;
                    case 5:
                        Task5.findingHighestScoreAndPosition(scoreOfStudents);
                        displayMenu();
                        break;
                    case 6:
                        Task6.collectHashtags();
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
