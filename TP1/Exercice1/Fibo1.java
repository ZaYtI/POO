package TP1.Exercice1;

import java.util.Scanner;

public class Fibo1 {

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

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrer un entier pour la suite de fibonnacci : ");
        int nombre = scanner.nextInt();

		scanner.close();

        System.out.printf("La valeur du nième terme de la suite de fibo est %d%n", fibonacci(nombre));
	}
}
