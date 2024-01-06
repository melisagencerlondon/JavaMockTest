package Java.PersonalPractice;

public class Greeting {//Create a method that will
    // say Hello in different language based on the country
    // that will passed when method is executed.
    // Do it for any five countries
    void languages(String country){
        if (country.equals("Turkiye")){
            System.out.println("Merhaba");
        } else if (country.equals("Dubai")) {
            System.out.println("Ahlan");

        } else if (country.equals("France")) {
            System.out.println("Bonjour");

        } else if (country.equals("Italy")) {
            System.out.println("Ciao");

        } else if (country.equals("Nederland")) {
            System.out.println("Hallo");

        }else {
            System.out.println("No greetings");
        }
    }



}
