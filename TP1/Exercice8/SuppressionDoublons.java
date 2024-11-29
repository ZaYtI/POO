package TP1.Exercice8;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class SuppressionDoublons {

    /**
     * Affiche dans la console la liste de nombre sans les doublons
     * @param numbers liste de nombre entrer par l'utilisateur
     */
    public static void removeDuplicateValue(List<Integer> numbers){
        // On utilise stream().distinct() pour récupérer la liste distinct des nombre et on la transform en list via la méthode .toList()
        System.out.printf("\nLa liste sans doublons %s%n",numbers.stream().distinct().toList());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // On créer une liste vide d'entier
        List<Integer> numbers = new ArrayList<>();
        Boolean isFinish = false;

        System.out.println("Entrer toute les valeurs voulue dans votre tableau");
        // On boucle tant que isFinish est false
        while (!isFinish) {
            System.out.printf("Entrer une valeur (compteur:%d): ", numbers.size());
            try {
                int value = scanner.nextInt();
                if(value==0){
                    // On arrete le programme si la valeur entrer est 0
                    isFinish = true;
                    break;
                }
                // On ajouter la valeur entrer dans le tableau
                numbers.add(value);
            } catch (InputMismatchException e) {
                System.out.println("La valeur entrée doit être un entier valide.");
                scanner.next();
            }
        }
        scanner.close();
        removeDuplicateValue(numbers);
    }
}
