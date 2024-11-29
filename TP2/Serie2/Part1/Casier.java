package TP2.Serie2.Part1;

public class Casier {
    private int[] tiroirs;
    private int numTiroirCourant;  // Numéro du tiroir courant
    private boolean appelPremier;  // Indique si Premier() a été appelé
    public static final int MAX_LENGTH = 10;

    public Casier() {
        tiroirs = new int[MAX_LENGTH];
        for (int i = 0; i < MAX_LENGTH; i++) {
            tiroirs[i] = 0;  // Initialisation des tiroirs à zéro
        }
        numTiroirCourant = 0;
        appelPremier = false;
    }

    // Méthode pour ranger un entier dans un tiroir
    public void range(int k, int i) {
        if (i >= 0 && i < MAX_LENGTH) {
            tiroirs[i] = k;
        } else {
            System.out.println("Les indices sont en dehors de la limite!");
        }
    }

    // Retourne le premier élément
    public int premier() {
        appelPremier = true;
        numTiroirCourant = 0;
        return tiroirs[numTiroirCourant];
    }

    // Retourne l'élément suivant
    public int suivant() {
        if (appelPremier && numTiroirCourant < MAX_LENGTH - 1) {
            numTiroirCourant++;
            return tiroirs[numTiroirCourant];
        }
        return -1;  // Indique qu'il n'y a pas d'élément suivant
    }

    // Vérifie s'il reste des éléments
    public boolean ilEnReste() {
        return numTiroirCourant < MAX_LENGTH - 1;
    }
}

