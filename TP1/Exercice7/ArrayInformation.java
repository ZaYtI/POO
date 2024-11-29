package TP1.Exercice7;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ArrayInformation {

    public static final int MAX=10;//Maximum de la taille de la liste (constante)

    /**
     * 
     * @param numbers liste de nombre entrer par l'utilisateur
     */
    public static void arrayInformationAverageMinAndMax(List<Integer> numbers){
        numbers.sort(Comparator.naturalOrder());

        int min = numbers.get(0);
        int max = numbers.get(numbers.size()-1);

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        double average = (double)sum / numbers.size();
        
        System.out.println("\nRésultats:");
        System.out.printf("Minimum : %d%n", min);
        System.out.printf("Maximum : %d%n",max);
        System.out.printf("Moyenne : %.2f%n",average);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        System.out.printf("Veuillez entrer %d valeurs entières:%n", MAX);

        //Tant que la taille de la liste est inférieur a max
        while (numbers.size() < MAX) {
            // Afficher dans la console a combien on est
            System.out.printf("Entrer une valeur (%d sur %d): ", numbers.size() + 1, MAX);
            try {
                int value = scanner.nextInt();
                // Ajoute l'entrer de l'utilisateur dans la liste
                numbers.add(value);
            } catch (InputMismatchException e) {
                // Renvoie un message dans la console si l'entrer n'est pas bonne et continue la boucle
                System.out.println("La valeur entrée doit être un entier valide.");
                scanner.next();
            }
        }
        scanner.close();
        arrayInformationAverageMinAndMax(numbers);
    }

}
