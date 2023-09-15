import java.util.Scanner;

public class IOScanner {
    // Here we created a global scanner to be used across all classes
    private static Scanner input = new Scanner(System.in);

    public static Scanner importScanner() {
        return input;
    }

    public static int readInt() {
         return input.nextInt();
       
    }

    public static void closeScanner() {
        input.close();
    }

    public static String readString() {
        return input.nextLine();
    }
}