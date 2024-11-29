package TP1.Partie2;

public class exo4 {
    public static void main (String [] args) {
        int n=0;
        do {
        if (n%2 == 0) {
        System.out.println (n + " est pair ") ;
        n+=3; continue;
        }
        if (n%3 == 0) {
        System.out.println (n + " est multiple de 3 ") ;
        n+=5;
        }
        if (n%5 == 0) {
        System.out.println (n + " est multiple de 5 ") ; break;
        }
        n+=1;
        } while (true);
        }
}

/**
 * Première éxécution le programme renvoie une erreur a la compilation
 * exo4.java:18: error: ';' expected
 * n+=1
 */

/***
 * Après la correction de l'erreur
 * 0 est pair 
 * 3 est multiple de 3 
 * 9 est multiple de 3 
 * 15 est multiple de 3 
 * 20 est multiple de 5 
 */
