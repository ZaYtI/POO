package TP1.Exercice2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AverageOfTheTwoLargestNumbers {

    public static void averageOfTwoLargestNumber(int a, int b, int c) {
        int max1;
        int max2;
    
        if (a >= b && a >= c) {
            max1 = a;
            max2 = Math.max(b, c);
        } else if (b >= a && b >= c) {
            max1 = b;
            max2 = Math.max(a, c);
        } else {
            max1 = c;
            max2 = Math.max(a, b);
        }
        double average = (double) max1/max2;
        System.out.printf("La moyenne des deux plus grand nombre est de (%d,%d) est de %.2f%n",max1,max2,average);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try{
            System.out.print("Entrer la valeur du premier nombre: ");

            int a = scanner.nextInt();

            System.out.print("Entrer la valeur du deuxième nombre: ");

            int b = scanner.nextInt();

            System.out.print("Entrer la valeur du troisième nombre: ");

            int c = scanner.nextInt();

            averageOfTwoLargestNumber(a, b, c);

        }catch(InputMismatchException e){
            System.out.println("Il faut entrer des valeurs de type int");
        }finally{
            scanner.close();
        }
    }
}
