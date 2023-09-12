public class Task6 {

    public static void collectHashtags() {
        System.out.print("Type your post: ");
        String hello = IOScanner.readString();

        String[] words = hello.split(" ");
        boolean foundHashtags = false;

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (word.startsWith("#")) {
                if (foundHashtags) {
                    System.out.print(" ");
                } else {
                    System.out.print("Hashtags found: ");
                }

                System.out.print(word);
                foundHashtags = true;
            }
        }

        if (!foundHashtags) {
            System.out.println("No hashtags were typed.");
        }
    }
}