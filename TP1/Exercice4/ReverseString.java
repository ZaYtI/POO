package TP1.Exercice4;

import java.util.Scanner;

public class ReverseString {

    public static String reverserWord(String word){
        String reverseString = "";

        char h;

        for (int i =0;i<word.length();i++){
            h = word.charAt(i);

            reverseString = h+reverseString;
        }

        return reverseString;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrer un mot a inverser: ");

        String word = scanner.nextLine();

        scanner.close();

        System.out.printf("Le mot inverser est : %s%n",reverserWord(word));
    }

}
