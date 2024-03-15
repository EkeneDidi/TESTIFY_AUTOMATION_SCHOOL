public class Task9a {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " an even number");
            } else if (!(i % 2 == 0)) {
                System.out.println(i + " an odd number.");
            } else {
                System.out.println("Null");
            }
        }
    }
}