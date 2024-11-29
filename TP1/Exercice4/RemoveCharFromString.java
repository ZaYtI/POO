package TP1.Exercice4;

import java.util.Scanner;

public class RemoveCharFromString {

    /**
     * 
     * @param letter lettre donner par l'utilisateur a enlever du mot
     * @param word mot donner par l'utilisateur
     * @return retourne le mot sans la lettre donner par l'utilisateur
     */
    public static String removeChar(char letter,String word){
        // On remplace les instance de la lettre par un caractère vide  et on le renvoie
        return word.replace(String.valueOf(letter), "");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Entrer un mot: ");

        String word = scanner.nextLine();

        System.out.print("Entrer la lettre a supprimer (si vous entrez plus d'une lettre seul la première sera prise!): ");

        // On récupère la lettre a enlever du mot (dans le cas ou plus d'une lettre est rentrer on ne prend que la première)
        char letter = scanner.next().charAt(0);

        scanner.close();

        // On vérifie via la méthode indexOf si la lettre éxiste dans le mot donc si indexOf ne renvoie pas -1
        if(word.indexOf(letter) != -1){
            // On affiche dans la console un message avec le mot la lettre et le mot sans la lettre
            System.out.printf("La mot %s sans la lettre %s est: %s%n",word,letter,removeChar(letter, word));
        }else{
            // On affiche un message qui spécifie a l'utilisateur que la lettre n'est pas présente dans le mot donnée
            System.out.printf("La lettre %s n'existe pas dans le mot %s%n",letter,word);
        }
    }

}
