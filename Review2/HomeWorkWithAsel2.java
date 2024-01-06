package Java.Review2;

public class HomeWorkWithAsel2 {
    public static void main(String[] args) {
        double mortgageRate = 1.9;
        double mortgagePrice = 200000;
        if (mortgageRate > 4.5) {
            System.out.println("You will not buy a house");
        }else if (mortgageRate <= 4.5) {
            System.out.println("You will buy a house");
        }
        if (mortgagePrice > 100000) {
            System.out.println("You need to take a loan");
        } else {
            System.out.println("You will pay cash");
        }


    }

}