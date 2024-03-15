
import java.util.Scanner;

public class Task9b {

    public static void main(String[] args) {
        Scanner wordLogic = new Scanner(System.in);
        String inputValue = "";

        do {
            System.out.print("Input the magic word: ");
            inputValue = wordLogic.nextLine();

            if (!inputValue.equalsIgnoreCase("testify")) {
                System.out.println("Try again.");
            }

        }

        while (!inputValue.equalsIgnoreCase("testify"));


        System.out.println("Awesome!!!! You found the right word");
    }
}
