package TP1.Exercice2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class SumAndAverage {

    private static final int MAX=10;

    public static void sumAndAverage(List<Integer> listOfNumbers){
        int sum = 0;
        for(int number: listOfNumbers){
            sum += number;
        }
        double average = (double)sum/listOfNumbers.size();
        System.out.printf("La moyenne de ces nombres et de %.2f et la somme de %d%n",average,sum);
    }

    public static List<Integer> buildListOfInterger(Scanner scanner,int max){
        List<Integer> numbers = new ArrayList<>();
        while (numbers.size() < max) {
            System.out.printf("Entrer un nombre (%d sur 10) : ", numbers.size() + 1);
            try {
                int value = scanner.nextInt();
                numbers.add(value);
            } catch (InputMismatchException e) {
                System.out.println("Il faut entrer une valeur de type int.Entrer une nouvelle valeurs");
                scanner.next();
            }
        }
        scanner.close();
        return numbers;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = buildListOfInterger(scanner, MAX);
        sumAndAverage(numbers);
    }
}
