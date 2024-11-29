package TP1.Exercice1;
import java.util.Scanner;

public class Fibo2 {

    public static int fibonacci(int max) {
		if (max <= 1) {
			return max;
		}
		else {
			return fibonacci(max - 2) + fibonacci(max - 1);
		}
	}

    public static void searchTheRang(int searchedTerm) {
        int u = 0;
        int actualTerm = 0;
    
        while (actualTerm <= searchedTerm) {
            u++;
            actualTerm = fibonacci(u);
        }
    
        System.out.printf("Le premier terme supérieur a la valeur: %d est %d au rang %d%n", searchedTerm, actualTerm, u);
    }
    

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrer un entier pour la suite de fibonnacci : ");
        int nombre = scanner.nextInt();
        scanner.close();
        searchTheRang(nombre);
	}
}
