package phase2;

import java.util.Scanner;
import java.util.Arrays;

public class Phase2 {
    public static void main(String[] args) {
        String city1="", city2="", city3="", city4="", city5="", city6="";
        String [] inputArray = new String[6];

        for (int i = 0; i < inputArray.length; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Write city " + i + ", please: \t");
            inputArray[i] = sc.next();
        }

        city1 = inputArray[0];
        city2 = inputArray[1];
        city3 = inputArray[2];
        city4 = inputArray[3];
        city5 = inputArray[4];
        city6 = inputArray[5];

        String[] arrayCiutat = inputArray;
        System.out.println("\n----- ARRAY SIN ORDENAR -----");
        for (String city : arrayCiutat) {
            System.out.print(city + ", ");
        }

        Arrays.sort(arrayCiutat);
        System.out.println("\n\n----- ARRAY ORDENADO -----");
        for (String city : arrayCiutat) {
            System.out.print(city + ", ");
        }
    }
}
