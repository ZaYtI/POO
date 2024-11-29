package TP1.Exercice7;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ArrayInformation {

    public static final int MAX=10;

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

        while (numbers.size() < MAX) {
            System.out.printf("Entrer une valeur (%d sur %d): ", numbers.size() + 1, MAX);
            try {
                int value = scanner.nextInt();
                numbers.add(value);
            } catch (InputMismatchException e) {
                System.out.println("La valeur entrée doit être un entier valide.");
                scanner.next();
            }
        }
        scanner.close();
        arrayInformationAverageMinAndMax(numbers);
    }

}
