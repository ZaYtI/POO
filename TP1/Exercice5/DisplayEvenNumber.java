package TP1.Exercice5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DisplayEvenNumber {

    /**
     * 
     * @param n la taille n de la liste de nombre entier voulue
     */
    public static void displayEvenNumber(int n) {
        System.out.printf("La liste des nombres pairs jusqu'à %d est : ", n);
        List<Integer> evenNumber = new ArrayList<>(); // Instanciation d une liste d'entier
        int i = 0;
        // Tant que la taille de la liste n'est pas égal a n-1
        while(evenNumber.size() <= n-1){
            i++;
            if(i%2==0){
                // Si le modulo de i est 0 on ajoute a la liste
                evenNumber.add(i);
            }
        }
        System.out.println(evenNumber.toString());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le nombre d'éléments n: ");

        // lie l'entier entrer par l'utilisateur
        int n = scanner.nextInt();
        scanner.close();

        // Affiche la liste des nombre pair
        displayEvenNumber(n);
    }
}
