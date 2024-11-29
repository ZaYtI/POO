package TP1.Exercice4;

import java.util.Scanner;

public class FoundOccurenceOfCharInString {

    public static int countOccurenceOfLetter(char letter,String word){
        return (int) word.chars().filter(c -> c == letter).count();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Entrer un mot: ");

        String word = scanner.nextLine();

        System.out.print("Entrer la lettre a retrouver (si vous entrez plus d'une lettre seul la première sera prise!):");

        char letter = scanner.next().charAt(0);

        scanner.close();

        System.out.printf("La lettre %s est présente %d fois dans le mot %s%n",letter,countOccurenceOfLetter(letter, word),word);
    }

}
