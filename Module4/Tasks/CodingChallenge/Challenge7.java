package CodingChallenge;

public class Challenge7 {
    public static void main(String[] args) {
        String mainText = "TestifyAutomation";

        String reverse = reverseString(mainText);

        System.out.println("Main Text is : " + mainText);
        System.out.println("Reversed Text is : " + reverse);
    }

    // Function to reverse a string using recursion
    private static String reverseString(String str) {
        if (str.isEmpty()) {
            return str;
        } else {
            // Concatenate the last character with the reversed substring of the rest of the string
            return str.charAt(str.length() - 1) + reverseString(str.substring(0, str.length() - 1));
        }
    }
}