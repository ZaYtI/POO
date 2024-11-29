package TP1.Exercice3;

import java.util.Scanner;

public class Carre {

    public static void buildCarre(int numberOfColumn) {
        for (int i = 0; i < numberOfColumn; i++) {
            for (int j = 0; j < numberOfColumn; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrer la taille du carre : ");

        try {
            int size = scanner.nextInt();

            if (size > 0) {
                buildCarre(size); 
            } else {
                System.out.println("La taille doit être un entier positif.");
            }
        } catch (Exception e) {
            System.out.println("Entrer une valeur de type int positive!!!!");
        } finally {
            scanner.close();
        }
    }
}
