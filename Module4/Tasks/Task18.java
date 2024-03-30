import java.util.InputMismatchException;
import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter your Age: ");
            int age = scanner.nextInt();
            System.out.println("Your current age is: " + age);
            scanner.close();

        } catch (InputMismatchException inputException){
            System.out.println("Invalid age syntax");
            System.out.println(inputException);

        }

    }
}