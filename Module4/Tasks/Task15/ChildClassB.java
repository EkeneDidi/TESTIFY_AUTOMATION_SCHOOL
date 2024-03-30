package Task15;

public class ChildClassB extends ParentClassA{

        public static void main(String[] args) {
            ChildClassB childAction = new ChildClassB();
           ParentClassA parentAction = new ParentClassA();
            parentAction.sing();
            parentAction.cook();
            parentAction.skill();
            childAction.dance();
            childAction.play();

        }

        public void dance (){
            System.out.println("He likes to dance");
        }

        public void play (){
            System.out.println("My baby plays the piano");
        }
    }

