package TP2.Serie2.Part2;

public class Main {
    public static void main(String[] args) {
        Syracuse seq1 = new Syracuse(10);
        Syracuse seq2 = new Syracuse(15);

        System.out.println("Suite Syracuse 1:");
        seq1.affiche();

        System.out.println("Suite Syracuse 2:");
        seq2.affiche();

        int somme = seq2.somme();
        System.out.println("Somme des termes de la deuxième suite : " + somme);
    }
}
