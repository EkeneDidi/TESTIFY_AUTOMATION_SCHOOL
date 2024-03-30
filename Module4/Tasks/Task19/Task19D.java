package Task19;

public class Task19D {
        String name = "Delta";

        public static void main(String[] args) {
            Task19D name = new Task19D();
            name.printName("Andrey");
        }

        public void printName(String name){
            System.out.println("Your name is: "+ this.name);
            System.out.println("My name is: "+ name);

        }

}
