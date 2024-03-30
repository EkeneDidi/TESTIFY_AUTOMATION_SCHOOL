package Task16B;

public class Child extends Parent{

        public static void main(String[] args) {
           Child Andrey = new Child();
            Andrey.playGuitar("Guitar");
            Andrey.dancing("dancing");

        }

        public void playGuitar(String type){
            System.out.println("Andrey plays the Guitar amazingly well.");
        }

        public void dancing(String type){
            System.out.println("Andrey dances Salsa too.");
        }
}
