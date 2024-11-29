package TP2.Serie2.Utils;

public abstract class Entiers {
    public abstract int premier();
    public abstract int suivant();
    public abstract boolean ilEnReste();

    // Affiche tous les entiers
    public void affiche() {
        int element = premier();
        while (ilEnReste()) {
            System.out.print(element + " ");
            element = suivant();
        }
        System.out.println();
    }

    // Calcule la somme des entiers
    public int somme() {
        int sum = 0;
        int element = premier();
        while (ilEnReste()) {
            sum += element;
            element = suivant();
        }
        return sum;
    }
}

