package TP1.Exercice8;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class SuppressionDoublons {

    public static void removeDuplicateValue(List<Integer> numbers){
        System.out.printf("\nLa liste sans doublons %s%n",numbers.stream().distinct().toList());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        Boolean isFinish = false;

        System.out.println("Entrer toute les valeurs voulue dans votre tableau");
        while (!isFinish) {
            System.out.printf("Entrer une valeur (compteur:%d): ", numbers.size());
            try {
                int value = scanner.nextInt();
                if(value==0){
                    isFinish = true;
                }else{
                    numbers.add(value);
                }
            } catch (InputMismatchException e) {
                System.out.println("La valeur entrée doit être un entier valide.");
                scanner.next();
            }
        }
        scanner.close();
        removeDuplicateValue(numbers);
    }
}
