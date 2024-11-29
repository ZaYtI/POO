package TP1.Exercice5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DisplayEvenNumber {

    public static void displayEvenNumber(int n) {
        System.out.printf("La liste des nombres pairs jusqu'à %d est : ", n);
        List<Integer> evenNumber = new ArrayList<>();
        int i = 0;
        while(evenNumber.size() <= n-1){
            i++;
            if(i%2==0){
                evenNumber.add(i);
            }
        }
        System.out.println(evenNumber.toString());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le nombre d'éléments n: ");
        int n = scanner.nextInt();
        scanner.close();

        displayEvenNumber(n);
    }
}
