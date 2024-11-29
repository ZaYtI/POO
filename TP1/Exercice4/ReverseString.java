package TP1.Exercice4;

import java.util.Scanner;

public class ReverseString {

    /**
     * 
     * @param word mot a inverser
     * @return mot inverser
     */
    public static String reverserWord(String word){
        String reverseString = "";

        char h; // Instaciation d un char qui va permettre de servir de tampon

        for (int i =0;i<word.length();i++){
            h = word.charAt(i);//On instancie h avec le caratère i du mot donner 

            reverseString = h+reverseString; // On ajoute le tampon au début du mot inverser 
        }

        // On renvoie le mot inverser
        return reverseString;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrer un mot a inverser: ");

        // On récupère le mot entrer par l'utilisateur
        String word = scanner.nextLine();

        scanner.close();

        // On affiche le mot inverser
        System.out.printf("Le mot inverser est : %s%n",reverserWord(word));
    }

}
