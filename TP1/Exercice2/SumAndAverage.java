package TP1.Exercice2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class SumAndAverage {

    // Définis la taille maximum de la liste entrer
    private static final int MAX=10;

    /**
     * 
     * @param listOfNumbers liste des nombre entrer par l'utilisateur
     */
    public static void sumAndAverage(List<Integer> listOfNumbers){
        int sum = 0;
        // boucle sur tout les nombre de la liste pour ajouter a la variable de somme
        for(int number: listOfNumbers){
            sum += number;
        }
        // On divise la somme par la valeur de la constante MAX pour obtenir la moyenne
        double average = (double)sum/MAX;
        System.out.printf("La moyenne de ces nombres et de %.2f et la somme de %d%n",average,sum);
    }

    /**
     * 
     * @param scanner scanner des valeurs entrer dans la console
     * @param max taille max de la liste
     * @return retourne la liste des nombre entrer par l'utilisateur
     */
    public static List<Integer> buildListOfInterger(Scanner scanner,int max){
        List<Integer> numbers = new ArrayList<>();
        // Boucle tant que la taille de la liste n'est pas égal a la taille max définis par la constante MAX
        while (numbers.size() < max) {
            System.out.printf("Entrer un nombre (%d sur 10): ", numbers.size() + 1);
            try {
                int value = scanner.nextInt();
                numbers.add(value);
            } catch (InputMismatchException e) {
                // Gestion des erreurs si les entrés sont invalide on re demande une valeur 
                System.out.println("Il faut entrer une valeur de type int.Entrer une nouvelle valeurs");
                scanner.next();
            }
        }
        scanner.close();
        return numbers;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // On instancie la liste grace a la méthode buildListOfInterger
        List<Integer> numbers = buildListOfInterger(scanner, MAX);
        // On affiche ensuite la somme et la moyenne de celle ci grace a sumAndAverage
        sumAndAverage(numbers);
    }
}
