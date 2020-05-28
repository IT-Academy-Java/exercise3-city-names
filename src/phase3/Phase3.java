package phase3;

import java.util.Arrays;
import java.util.Scanner;

public class Phase3 {
    public static void main(String[] args) {
        String city1="", city2="", city3="", city4="", city5="", city6="";
        String [] inputScannerArray = new String[6];

        for (int i = 0; i < inputScannerArray.length; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Write city " + i + ", please: \t");
            String auxActualInputScanner =  sc.next();
            inputScannerArray[i] = changeLetterA(auxActualInputScanner);
        }

        city1 = inputScannerArray[0];
        city2 = inputScannerArray[1];
        city3 = inputScannerArray[2];
        city4 = inputScannerArray[3];
        city5 = inputScannerArray[4];
        city6 = inputScannerArray[5];

        String[] arrayCiutat = inputScannerArray;
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

    public static String changeLetterA(String word){
        String newWord = "";
        for (int i = 0; i < word.length(); i++) {
            if(word.charAt(i) == 'A' || word.charAt(i) == 'a'){
                newWord += "4";
            } else{
                newWord += word.charAt(i);
            }
        }
        return newWord;
    }
}
