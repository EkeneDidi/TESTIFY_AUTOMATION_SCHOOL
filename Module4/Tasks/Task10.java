import java.util.Scanner;

public class Task10 {

    public static void main(String[] args) {
        visitorVerification();

    }

    public static void visitorVerification() {

        Scanner visitorV = new Scanner(System.in);

        System.out.print("What is your reason for joining this Slack channel:  ");
        String userInput = visitorV.nextLine();

        if (userInput.equalsIgnoreCase("testify")) {

            System.out.println("You are Welcome To Testify Academy.");
        } else {

            System.out.println("You are ineligible to be on the channel. Please exit channel or register.");
        }

    }
}
