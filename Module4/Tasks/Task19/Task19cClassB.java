package Task19;


    public class Task19cClassB extends Task19cClassA {
        String name = "Anderson";

        public static void main(String[] args) {
            Task19cClassB data = new Task19cClassB();
            data.printName();
        }

        public void printName(){
            System.out.println("My ClassA name is "+ name);
            System.out.println("My ClassB name is "+ name);

        }
}
