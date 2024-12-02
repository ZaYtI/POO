package TP2.Serie2.Part2;

public class Main {
    public static void main(String[] args) {
        // Initialisation des séquence
        Syracuse seq1 = new Syracuse(10);
        Syracuse seq2 = new Syracuse(15);

        // Affichage de la première séquence
        System.out.println("Suite Syracuse 1:");
        seq1.affiche();

        // Affichage de la deuxième séquence
        System.out.println("Suite Syracuse 2:");
        seq2.affiche();

        // Récupération de la somme des termes de la deuxième séquence
        int somme = seq2.somme();
        // Affichage de la somme des termes
        System.out.println("Somme des termes de la deuxième suite : " + somme);
    }
}
