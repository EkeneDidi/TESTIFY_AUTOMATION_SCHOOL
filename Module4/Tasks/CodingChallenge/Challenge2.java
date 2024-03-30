package CodingChallenge;

public class Challenge2 {
    public static void main(String[] args) {
        String text = "I am the best Automation Tester";

        System.out.println("Actual sentence is: " + text);
        String sentenceReverse = reverseText(text);
        System.out.println("Reversed sentence is: " + sentenceReverse);
    }

    // Function to reverse the position of words in a sentence using recursion
    private static String reverseText(String text) {
        if (text.isEmpty()) {
            return text;
        } else {
            // Find the index of the first space
            int spaceIndex = text.indexOf(' ');

            if (spaceIndex == -1) {

                return text;
            } else {

                return reverseText(text.substring(spaceIndex + 1)) + " " + text.substring(0, spaceIndex);
            }
        }
    }
}
