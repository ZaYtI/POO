package TP1.Exercice2;

import java.util.Scanner;

public class ReadTwoInt {

    /**
     * 
     * @param a premier entier
     * @param b deuxieme entier
     * @return retourne la somme des valeurs a et b
     */
    public static int sum(int a,int b){
        return a + b;
    }
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Entrer les valeurs pour lesquels on veut la somme
        System.out.print("Entrer la valeur de a: ");
        int a = scanner.nextInt();

        System.out.print("Entrer la valeur de b: ");
        int b = scanner.nextInt();

        scanner.close();

        System.out.printf("La somme de %d est %d est de : %d%n",a,b,sum(a,b));
    }
}
