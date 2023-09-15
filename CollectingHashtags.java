public class CollectingHashtags {

    // Here is our method for string manipulation identifying hashtags.
    // Later in the program we call for this method by itself
    // since it's independet from other methods.
    public static void collectHashtags() {
        System.out.print("Type your post: ");
        String input = IOScanner.readString();

        String[] words = input.split(" ");
        boolean foundHashtags = false;

        // This loop is identifying whether a word starts with a hashtag.
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