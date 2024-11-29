package TP1.Exercice4;

import java.util.Scanner;

public class ToUppercase {

    public static String toUppercase(String word){
        String uppercaseWord = "";

        char h;

        for (int i =0;i<word.length();i++){
            h = word.charAt(i);

            uppercaseWord += Character.toUpperCase(h);
        }

        return uppercaseWord;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrer un mot a inverser: ");

        String word = scanner.nextLine();

        scanner.close();

        System.out.printf("Le mot a mettre en majuscule : %s%n",toUppercase(word));
    }
}
