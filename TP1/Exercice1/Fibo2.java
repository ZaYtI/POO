package TP1.Exercice1;
import java.util.Scanner;

public class Fibo2 {

    /**
	 * 
	 * @param max
	 * @return n-ième terme de la suite de Fibonacci
	 */
    public static int fibonacci(int max) {
		if (max <= 1) {
			return max;
		}
		else {
			return fibonacci(max - 2) + fibonacci(max - 1);
		}
	}

    /**
     * 
     * @param searchedTerm
     */
    public static void searchTheRang(int searchedTerm) {
        int u = 0;
        int actualTerm = 0;
        
        //On boucle tant que le terme actuel retourner par fibonnacci est inférieur par le terme rechercher @searchedTerm
        while (actualTerm <= searchedTerm) {
            u++;
            actualTerm = fibonacci(u);
        }
        
        //Affiche le terme rechercher avec le terme trouver ainsi que le rang
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
