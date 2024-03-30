package Task17B;

public class TestClassA implements UnitClassB {

        @Override
        public void usernameTest(String username) {
            System.out.println("Enter valid username");
        }

        @Override
        public void passwordTest(String password) {
            System.out.println("Enter valid password");
        }

        @Override
        public void loginSuccessful(String username, String password) {
            System.out.println("Login is Successful");
        }
    }

