import java.util.Scanner;

    public class Menu {
        public static void main(String[] args) {
        
            Scanner input = new Scanner(System.in);

            int[] scoreOfStudents = new int[7];
            

            for (int i = 0; i < scoreOfStudents.length; i++) {
                int studentNumber = i + 1;
                System.out.print("Enter the score for the " + numberAndSuffix(studentNumber) + " student ");
                
                int scoreInCaseOf = 0;
                boolean inputValidation = false;

                while (!inputValidation){
                    scoreInCaseOf = input.nextInt();
                    if (scoreInCaseOf <= 100 && scoreInCaseOf >= 0){
                    inputValidation = true;
                    } else {
                    System.out.println("Error - Input out of bound. Score can only be between 0 and 100.");
                    System.out.print("Enter the score for the " + numberAndSuffix(studentNumber) + " student ");
                    }
                }
                scoreOfStudents[i] = scoreInCaseOf;


            }


            System.out.printf("Thank you for your input. %n" + "Your entered scores are: %n");

            for (int i = 0; i < scoreOfStudents.length; i++){
            System.out.printf(scoreOfStudents[i] + ", ");
            }
            
            input.close();
        }



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



    }
         
