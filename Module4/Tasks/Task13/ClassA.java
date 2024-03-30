package Task13;

public class ClassA {

        String name;
        int age;
        boolean female;

        public ClassA(String Pname){
            name = Pname;
        }

        public ClassA(int Page){
            age = Page;
        }

    public ClassA(boolean Pfemale){
        female = Pfemale;
    }


    public ClassA(String Pname, int Page, boolean Pfemale) {
            name = Pname;
            age = Page  ;
            female = Pfemale;
    }
    }