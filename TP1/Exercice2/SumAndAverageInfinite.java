package TP1.Exercice2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class SumAndAverageInfinite {

    public  static List<Integer> buidListOfIntegers(Scanner scanner){
        List<Integer> numbers = new ArrayList<>();
        Boolean isEnd = false;
        while (!isEnd) {
            try {
                System.out.printf("Entrer une valeur (compteur:%d)",numbers.size());
                int value = scanner.nextInt();
                if(value == 0){
                    isEnd = true;
                }
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
        List<Integer> numbers = buidListOfIntegers(scanner);
        SumAndAverage.sumAndAverage(numbers);
    }
}
