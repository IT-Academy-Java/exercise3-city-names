package phase4;

import java.util.Arrays;
import java.util.Scanner;

public class Phase4 {
  public static void main(String[] args) {
    String city1 = "", city2 = "", city3 = "", city4 = "", city5 = "", city6 = "";

    String[] inputScannerArray = new String[6];
    for (int i = 0; i < inputScannerArray.length; i++) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Write city " + i + ", please: \t");
      String auxActualInputScanner = sc.next();
      inputScannerArray[i] = auxActualInputScanner;
    }

    city1 = inputScannerArray[0];
    city2 = inputScannerArray[1];
    city3 = inputScannerArray[2];
    city4 = inputScannerArray[3];
    city5 = inputScannerArray[4];
    city6 = inputScannerArray[5];

    String[] nomCity1 = new String[city1.length()];
    rellenarArray(nomCity1, city1);

    String[] nomCity2 = new String[city2.length()];
    rellenarArray(nomCity2, city2);

    String[] nomCity3 = new String[city3.length()];
      rellenarArray(nomCity3, city3);

    String[] nomCity4 = new String[city4.length()];
      rellenarArray(nomCity4, city4);

    String[] nomCity5 = new String[city5.length()];
      rellenarArray(nomCity5, city5);

    String[] nomCity6 = new String[city6.length()];
      rellenarArray(nomCity6, city6);

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

      System.out.println("\n\nIMPRIMIENDO LOS ARRAYS INVERTIDOS");
      invertirArray(nomCity1);
      invertirArray(nomCity2);
      invertirArray(nomCity3);
      invertirArray(nomCity4);
      invertirArray(nomCity5);
      invertirArray(nomCity6);
  }

  public static String changeLetterA(String word) {
    String newWord = "";
    for (int i = 0; i < word.length(); i++) {
      if (word.charAt(i) == 'A' || word.charAt(i) == 'a') {
        newWord += "4";
      } else {
        newWord += word.charAt(i);
      }
    }
    return newWord;
  }

  public static void rellenarArray(String[] nameArray, String nameCity){
      for (int i = 0; i < nameCity.length(); i++) {
          nameArray[i] = ""+nameCity.charAt(i);
      }
  }

  public static void invertirArray(String[] city){
      for (int i=0; i<city.length/2; i++) {
          String aux = city[i];
          city[i] = city[city.length-1-i];
          city[city.length-1-i] = aux;
      }

      for (String c : city) {
          System.out.print(c + " - ");
      }
      System.out.println();
  }
}
