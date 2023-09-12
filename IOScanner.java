import java.util.Scanner;

public class IOScanner {

    private static Scanner input = new Scanner(System.in);

    public static Scanner importScanner() {
        return input;
    }

    public static int readInt() {
        int value = input.nextInt();
        input.nextLine();

        return value;
    }

    public static void closeScanner() {
        input.close();
    }

    public static String readString() {
        return input.nextLine();
    }
}