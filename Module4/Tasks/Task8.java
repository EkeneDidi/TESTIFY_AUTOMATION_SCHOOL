
import java.util.Scanner;

public class Task8 {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter principal amount: ");
            double principal = scanner.nextDouble();

            System.out.print("Enter annual interest rate (in percentage): ");
            double rate = scanner.nextDouble();

            System.out.print("Enter time period (in years): ");
            double time = scanner.nextDouble();

            double simpleInterest = (principal * rate * time) / 100;

            System.out.println("The Simple Interest for Principal amount " + principal +
                    " at an annual interest rate of " + rate + "% for " + time + " years is: " + simpleInterest);

            scanner.close();
        }
    }

