package CodingChallenge;

public class Challenge4 {
    public static void main(String[] args) {

        System.out.println("The Prime numbers between 1 and 100 are:");

        for (int i = 1; i <= 100; i++) {
            if (PrimeNum(i)) {
                System.out.print(i + " ");
            }
        }
    }

    // Function to check if a number is prime
    private static boolean PrimeNum(int number) {
        if (number <= 0) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }


}
