package Java.class9;

public class T6 {
    public static void main(String[] args) {
        //Create 2D array of countries: north america countries,
        // south america countries, europe countries, asian countries, african countries.
        // Then print all values from that array using 2 different loops and
        // calculate how many total countries been stored.
        String[][] countries = {
                {"Mexico", "Canada", "Guatemala"},
                {"Brazil", "Colombia", "Chile"},
                {"Italy", "Germany", "France"},
                {"Turkiye", "China", "Pakistan"},
                {"Nigeria", "Kenya", "Morocco"},
        };

        int TotalCountries = 0;
        for (int i = 0; i < countries.length; i++) {
            for (int j = 0; j < countries[i].length; j++) {
                System.out.print(countries[i][j] + " ");

                TotalCountries++;
            }
            System.out.println();

        }
        System.out.println("Total Number of Contries:" + TotalCountries);


    }

    }









