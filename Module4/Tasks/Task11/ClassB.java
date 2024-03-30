package Task11;

public class ClassB {
    private String name;

    public static void main(String[] args) {

        ClassB person = new ClassB();
        person.name = "Ekene Nworah";

        person.personalData(person.name);

        System.out.println(person.name);
    }
    private void personalData(String name) {
    }
}
