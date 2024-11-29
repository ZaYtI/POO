package TP1.Exercice2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AverageOfTheTwoLargestNumbers {

    /**
     * 
     * @param a entier entrer par l'utilisateur
     * @param b entier entrer par l'utilisateur
     * @param c entier entrer par l'utilisateur
     */
    public static void averageOfTwoLargestNumber(int a, int b, int c) {
        int max1;
        int max2;
        
        // Si a est supérieur ou égal a (b et c)
        if (a >= b && a >= c) {
            max1 = a;
            
            // On cherche la valeur max entre (b et c)
            max2 = Math.max(b, c);
        }
        // Sinon si b supérieur a (b et c)
        else if (b >= a && b >= c) {
            max1 = b;

            // On cherche le max entre (a et c)
            max2 = Math.max(a, c);
        } 
        // Sinon c et alors supérieur a (a et b)
        else {
            max1 = c;
            max2 = Math.max(a, b);
        }
        double average = (double) max1/max2;
        System.out.printf("La moyenne des deux plus grand nombre est de (%d,%d) est de %.2f%n",max1,max2,average);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Entrer les valeurs de chacune des variables (a b et c)
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
