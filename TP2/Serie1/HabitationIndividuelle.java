package TP2.Serie1;
public class HabitationIndividuelle extends Habitation {
    private int nbPieces;
    private boolean piscine;

    // Constructeur
    public HabitationIndividuelle(String proprietaire, String adresse, double surface, int nbPieces, boolean piscine) {
        super(proprietaire, adresse, surface);
        this.nbPieces = nbPieces;
        this.piscine = piscine;
    }

    /**
     * Redéfinition du calcul d'impots
     */
    @Override
    public double impot() {
        double base = super.impot();
        double piscineCost = piscine ? 50.45 : 0;
        return base + (nbPieces * 5.79) + piscineCost;
    }

    /**
     * Redéfinition de la méthode d'affichage
     */
    @Override
    public void affiche() {
        super.affiche();
        System.out.println("Nombre de pièces : " + nbPieces);
        System.out.println("Existence d'une piscine : " + (piscine ? "Oui" : "Non"));
    }
}
