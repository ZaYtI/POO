package TP1.Exercice2;

import java.util.Scanner;

public class HoursMinutesSecondsToNext {

    /**
     * Affiche l'heure après une seconde supplémentaire.
     * @param hours nombre d'heures
     * @param minutes nombre de minutes
     * @param secondes nombre de secondes
     */
    public static void next(int hours, int minutes, int secondes) {
        secondes++;
        if (secondes > 59) {
            secondes = 0;
            minutes++;
            if (minutes > 59) {
                minutes = 0;
                hours++;
                if (hours > 23) {
                    hours = 0;
                }
            }
        }
        // Affiche la seconde suivante dans la console
        System.out.printf("La seconde suivante : %02dh:%02dm:%02ds%n", hours, minutes, secondes);
    }

    /**
     * 
     * @param scanner scanner de l'application
     */
    public static void invalidScanner(Scanner scanner){
        System.out.println("Entrer un entier valide.");
        scanner.next(); // Nettoyer l'entrée incorrecte
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = -1;
        int minutes = -1;
        int secondes = -1;

        // Validation de l'entrée des heures
        while (hours < 0 || hours > 23) {
            System.out.print("Entrez le nombre d'heures (0-23) : ");
            if (scanner.hasNextInt()) {
                hours = scanner.nextInt();
                if (hours < 0 || hours > 23) {
                    System.out.println("Entrer une valeur entre 0 et 23.");
                }
            } else {
                invalidScanner(scanner);
            }
        }

        // Validation de l'entrée des minutes
        while (minutes < 0 || minutes > 59) {
            System.out.print("Entrez le nombre de minutes (0-59) : ");
            if (scanner.hasNextInt()) {
                minutes = scanner.nextInt();
                if (minutes < 0 || minutes > 59) {
                    System.out.println("Entrer une valeur entre 0 et 59.");
                }
            } else {
                invalidScanner(scanner);
            }
        }

        // Validation de l'entrée des secondes
        while (secondes < 0 || secondes > 59) {
            System.out.print("Entrez le nombre de secondes (0-59) : ");
            if (scanner.hasNextInt()) {
                secondes = scanner.nextInt();
                if (secondes < 0 || secondes > 59) {
                    System.out.println("Entrer une valeur entre 0 et 59.");
                }
            } else {
                invalidScanner(scanner);
            }
        }

        // Calculer et afficher la seconde suivante
        next(hours, minutes, secondes);

        scanner.close();
        System.out.println("Programme terminé.");
    }
}
