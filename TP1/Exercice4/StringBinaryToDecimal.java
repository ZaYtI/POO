package TP1.Exercice4;

import java.util.Scanner;

public class StringBinaryToDecimal {
    
    public static int stringBinaryToDecimal(String binaryValue){
        return Integer.parseInt(binaryValue,2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrer un nombre binaire: ");

        String binaryValue = scanner.nextLine();

        scanner.close();

        System.out.printf("La valeur décimal de %s est %d%n",binaryValue,stringBinaryToDecimal(binaryValue));
    }
}
