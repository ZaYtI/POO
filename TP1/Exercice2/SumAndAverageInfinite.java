package TP1.Exercice2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class SumAndAverageInfinite {

    /**
     * 
     * @param scanner
     * @return retourne la liste des nombre entrer dans la console par l'utilsateur
     */
    public  static List<Integer> buidListOfIntegers(Scanner scanner){
        List<Integer> numbers = new ArrayList<>();
        Boolean isEnd = false;
        // On boucle tant que la valeur de isEnd est a false
        while (!isEnd) {
            try {
                System.out.printf("Entrer une valeur (compteur:%d): ",numbers.size());
                int value = scanner.nextInt();
                //Si la valeur entrer par l'utilisateur est 0 on arrête l'éxécution de la boucle en mettant isEnd a true
                if(value == 0){
                    isEnd = true;
                    break;
                }
                // On ajoute la valeurs dans la liste
                numbers.add(value);
            } catch (InputMismatchException e) {
                System.out.println("Il faut entrer une valeur de type int.Entrer une nouvelle valeurs");
                scanner.next();
            }
        }
        scanner.close();

        return numbers;
    }

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
        // On divise la somme par la taille de la liste pour obtenir la moyenne
        double average = (double)sum/listOfNumbers.size();
        System.out.printf("La moyenne de ces nombres et de %.2f et la somme de %d%n",average,sum);
    }
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //On instancie la liste avec la méthode buidListOfIntegers
        List<Integer> numbers = buidListOfIntegers(scanner);
        //On affiche ensuite la moyenne ainsi que la somme des valeurs de la liste via la méthode sumAndAverage
        sumAndAverage(numbers);
    }
}
