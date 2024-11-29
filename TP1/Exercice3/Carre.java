package TP1.Exercice3;

import java.util.Scanner;

public class Carre {

    /**
     * 
     * @param numberOfColumn le nombre de column souhaiter (nombre d'étoile)
     * Affiche un carré d'étoile
     */
    public static void buildCarre(int numberOfColumn) {
        for (int i = 0; i < numberOfColumn; i++) {
            for (int j = 0; j < numberOfColumn; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = -1;
        System.out.print("Entrer la taille du carre : ");
        // On fait une boucle tant que la taille entrer par l'utilisateur n'est pas bonne (<=0)
        while (size <= 0) {
            System.out.print("Entrez la taille du carre positif: ");
            if (scanner.hasNextInt()) {
                size = scanner.nextInt();
                if (size <= 0) {
                    System.out.println("La taille doit être un entier positif.");
                }
            } else {
                System.out.println("Entrer un entier valide.");
                scanner.next(); 
            }
        }
        scanner.close();
        buildCarre(size);
    }
}
