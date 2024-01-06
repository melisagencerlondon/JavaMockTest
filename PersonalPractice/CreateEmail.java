package Java.PersonalPractice;

public class CreateEmail {
    //Create a method createEmail(). Based on values of users firstName, lastName and email type,
    // your method should return complete email Address.
    // Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com
    String CreateEmail(String firstNmae, String LastName, String etype) {
        String email = firstNmae + LastName + "@" + etype + "co.uk";
        return email;
    }


}
