package TP1.Exercice4;

import java.util.Scanner;

public class FoundOccurenceOfCharInString {

    /**
     * 
     * @param letter lettre demander par l'utilisateur
     * @param word mot donner par l'utilisateur
     * @return retourne le nombre d'occurence de la lettre dans le mot 
     */
    public static int countOccurenceOfLetter(char letter,String word){
        // On filtre sur le mot les lettres correspondant a celle donner par l'utilisateur cela nous une liste de char ( exemple :{'c','c','c'}) de lettre demande et on fais un .count() dessus
        return (int) word.chars().filter(c -> c == letter).count();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Entrer un mot: ");

        // On récupère le mot entrer par l'utilisateur
        String word = scanner.nextLine();

        System.out.print("Entrer la lettre a retrouver (si vous entrez plus d'une lettre seul la première sera prise!):");

        // On récupère la lettre entrer par l'utilisateur (dans le cas ou il en entre plusieur on ne prend que la première)
        char letter = scanner.next().charAt(0);

        scanner.close();

        // On affiche le nombre d'occurence de la lettre entrer par l'utilisateur
        System.out.printf("La lettre %s est présente %d fois dans le mot %s%n",letter,countOccurenceOfLetter(letter, word),word);
    }

}
