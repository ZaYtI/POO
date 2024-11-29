package TP1.Partie2;

public class exo3 {
    public static void main (String [] args) {
        int n=0, p ;
        while (n <= 5) n++;
        System.out.println ("A : n = " + n);
        n=p=0;
        while (p <= 8) p++;
        System.out.println ("B : n = " + n);
        n=p=0;
        while (p <= 8)n+= ++p;
        System.out.println ("C : n = " + n);
        }
}
/***
 * retour du programme ci dessus:
 *  A : n = 6
 *  B : n = 0
 *  C : n = 45
 */
