package TP1.Exercice2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FrancsToEurosWithChange {

    /**
     * 
     * @param sumFrancs Somme de francs
     * @param changeRate Taux de change 
     * @return retourne la somme en fonction du taux de change imposer
     */
    public static double sumOfEuros(double sumFrancs,double changeRate){
        System.out.println(sumFrancs*changeRate);
        return sumFrancs * changeRate;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Permet a l'utilisateur d'entrer la somme de francs et le taux de change voulue
        try{
            System.out.print("Entrer la quantité de Francs");
            double sumFrancs = scanner.nextDouble();
            System.out.print("Entrer le taux de change");
            double changeRate = scanner.nextDouble();
            scanner.close();
            System.out.printf("La somme en euros pour %.2f avec un taux de change de %.2f est de %.2fn",sumFrancs,changeRate,sumOfEuros(sumFrancs, changeRate));
        }catch (InputMismatchException error){
            // Affiche une erreur plus détaillé dans la console
            System.out.println("Il faut entrer des valeurs de type double");
        }finally{
            scanner.close();
        }
    }
}
