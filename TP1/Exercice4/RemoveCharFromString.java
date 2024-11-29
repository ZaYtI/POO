package TP1.Exercice4;

import java.util.Scanner;

public class RemoveCharFromString {

    public static String removeChar(char letter,String word){
        return word.replace(String.valueOf(letter), "");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Entrer un mot: ");

        String word = scanner.nextLine();

        System.out.print("Entrer la lettre a supprimer (si vous entrez plus d'une lettre seul la première sera prise!): ");

        char letter = scanner.next().charAt(0);

        scanner.close();

        if(word.indexOf(letter) != -1){
            System.out.printf("La mot %s sans la lettre %s est: %s%n",word,letter,removeChar(letter, word));
        }else{
            System.out.printf("La lettre %s n'existe pas dans le mot %s%n",letter,word);
        }
    }

}
