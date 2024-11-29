package TP1.Exercice6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ReverseInt {

    public static int reverseNumber(int n){
        int reversedNumber =0;

        while (n != 0) {
            reversedNumber = reversedNumber * 10;
            reversedNumber = reversedNumber + n % 10;
            n = n / 10;
        }
        return reversedNumber;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.print("Entrez un nombre à inverser : ");
            int n =scanner.nextInt();
            System.out.printf("La valeur inverse de %d est %d%n",n,reverseNumber(n));
        }catch(InputMismatchException e){
            System.out.println("La valeur en entrer doit être un entier");
        }finally{
            scanner.close();
        }
    }

}
