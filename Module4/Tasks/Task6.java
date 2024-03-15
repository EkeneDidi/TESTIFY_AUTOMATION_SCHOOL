public class Task6 {
    public static void main(String[] args) {

        String word  = "dEMOCRACY";

        //reverse word
        String reversedString = new StringBuilder(word).reverse().toString();

        System.out.println(reversedString);
        System.out.println(reversedString.substring(4,8));

    }
}
