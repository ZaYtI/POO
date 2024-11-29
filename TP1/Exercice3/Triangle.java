package TP1.Exercice3;

import java.util.Scanner;

public class Triangle {


    /**
     * 
     * @param numberOfRow nombre de ligne souhaiter
     * Affiche un triangle d'étoile
     */
    public static void buildTriangle(int numberOfRow) {
        for (int i = 1; i < numberOfRow+1; i++) {
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = -1;

        System.out.print("Entrer la taille du carre: ");
        // On fait une boucle tant que la taille entrer par l'utilisateur n'est pas bonne (<=0)
        while (size <= 0) {
            System.out.print("Entrez la taille du carré (entier positif): ");
            //Si le scanner a un entier 
            if (scanner.hasNextInt()) {
                size = scanner.nextInt();
                // Si il est <=0 on affiche un message
                if (size <= 0) {
                    System.out.println("La taille doit être un entier strictement positif.");
                }
            } else {
                // Si l'entrer n'est pas un entier on affiche un message et on passe a la prochaine ligne du scanner
                System.out.println("Veuillez entrer un entier valide.");
                scanner.next(); 
            }
        }
        scanner.close();
        buildTriangle(size);
    }
}
