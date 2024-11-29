package TP1.Exercice6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ReverseInt {

    /**
     * Cette méthode inverse les chiffres d'un entier donné.
     *
     * @param n le nombre à inverser
     * @return le nombre inversé
     */
    public static int reverseNumber(int n) {
        int reversedNumber = 0; // Initialisation du nombre inversé à 0

        // Tant qu'il reste des chiffres à traiter
        while (n != 0) {
            reversedNumber = reversedNumber * 10; // Décale les chiffres du nombre inversé vers la gauche
            reversedNumber = reversedNumber + n % 10; // Ajoute le dernier chiffre de 'n' au nombre inversé
            n = n / 10; // Supprime le dernier chiffre de 'n' en effectuant une division entière
        }

        // Retourne le nombre inversé une fois tous les chiffres traités
        return reversedNumber;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        // Récupère est vérifie l'entrer de l'utilisateur pour afficher le nombre inverser
        try {
            System.out.print("Entrez un nombre à inverser : ");
            int n = scanner.nextInt();
            System.out.printf("La valeur inverse de %d est %d%n", n, reverseNumber(n));
        } catch (InputMismatchException e) {
            System.out.println("La valeur en entrer doit être un entier");
        } finally {
            scanner.close();
        }
    }

}
