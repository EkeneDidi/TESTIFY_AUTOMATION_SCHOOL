package CodingChallenge;

public class Challenge1 {

        public static void main(String[] args) {
            String test1 = "racecar";
            String test2 = "10801";


            if (isPalindrome(test1)) {
                System.out.println(test1 + " is a palindrome.");
            } else {
                System.out.println(test1 + " is not a palindrome.");
            }

            if (isPalindrome(test2)) {
                System.out.println(test2 + " is a palindrome.");
            } else {
                System.out.println(test2 + " is not a palindrome.");
            }
        }

        // Function to check if a string is a palindrome
        private static boolean isPalindrome(String str) {

            String cleanStr = str.replaceAll("\\s", "").toLowerCase();

            int length = cleanStr.length();
            for (int i = 0; i < length / 2; i++) {
                if (cleanStr.charAt(i) != cleanStr.charAt(length - 1 - i)) {
                    return false;
                }
            }
            return true;
        }
    }
