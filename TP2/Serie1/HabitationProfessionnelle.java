package TP2.Serie1;

public class HabitationProfessionnelle extends Habitation {
    private int nbEmployes;

    // Constructeur
    public HabitationProfessionnelle(String proprietaire, String adresse, double surface, int nbEmployes) {
        super(proprietaire, adresse, surface);
        this.nbEmployes = nbEmployes;
    }

    /**
     * Redéfinition du calcul d'impot pour les habitation pro
     */
    @Override
    public double impot() {
        double base = super.impot();
        return base + (nbEmployes / 10) * 9.42;
    }

    /**
     * Redéfinition de la méthode pour afficher les informations des habitation pro
     */
    @Override
    public void affiche() {
        // Affiche les infos du parents
        super.affiche();
        // Affiche les informations supplémentaire
        System.out.println("Nombre d'employés : " + nbEmployes);
    }
}
