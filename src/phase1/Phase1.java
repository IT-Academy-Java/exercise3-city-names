package phase1;

import java.util.Scanner;

public class Phase1 {
    public static void main(String[] args) {
        String city1="", city2="", city3="", city4="", city5="", city6="";
        String [] inputArray = new String[6];

        for (int i = 0; i < inputArray.length; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Write city " + i + ", plesae");
            inputArray[i] = sc.next();
        }

        city1 = inputArray[0];
        city2 = inputArray[1];
        city3 = inputArray[2];
        city4 = inputArray[3];
        city5 = inputArray[4];
        city6 = inputArray[5];

        System.out.println(city1 + " - " + city2 + " - " + city3 + " - " + city4 + " - " + city5 + " - " + city6);
    }
}
