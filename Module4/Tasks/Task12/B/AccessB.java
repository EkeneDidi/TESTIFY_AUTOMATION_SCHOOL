package Task12.B;

import Task12.A.AccessA;

public class AccessB {
    public static void main(String[] args) {
        AccessA access = new AccessA();
        access.accessAmethod();
    }

    private void accessBmethod() {
        System.out.println("Just accessible for this class");
    }
}