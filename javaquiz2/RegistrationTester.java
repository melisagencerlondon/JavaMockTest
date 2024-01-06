package Java.javaquiz2;

class Registration {
    private String email;
    private String userName;
    private String password;

    public void setEmail(String email) {
        if (email.toLowerCase().endsWith("@yahoo.com")) {
            this.email = email;
            System.out.println("Email set successfully.");
        } else {
            System.out.println("Invalid email. Please use Yahoo email.");
        }
    }

    public void setUserName(String userName) {
        if (userName.length() > 6 && !password.contains(userName)) {
            this.userName = userName;
            System.out.println("Username set successfully.");
        } else {
            System.out.println("Invalid username. Username should be longer than 6 characters and not contain in the password.");
        }
    }

    public void setPassword(String password) {
        if (password.length() > 6 && !password.contains(userName)) {
            this.password = password;
            System.out.println("Password set successfully.");
        } else {
            System.out.println("Invalid password. Password should be longer than 6 characters and not contain the username.");
        }
    }
}

public class RegistrationTester {
    public static void main(String[] args) {
        Registration userRegistration = new Registration();

        userRegistration.setEmail("example@yahoo.com");
        userRegistration.setUserName("user123");
        userRegistration.setPassword("securePass123");
    }
}