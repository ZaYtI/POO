package TP2.Serie1;

public class Habitation {
    private String proprietaire;
    private String adresse;
    private double surface;

    // Constructeur
    public Habitation(String proprietaire, String adresse, double surface) {
        this.proprietaire = proprietaire;
        this.adresse = adresse;
        this.surface = surface;
    }

    /**
     * Méthode de calcul d'impot
     * @return retourne l'impot du en fonction de la surface
     */
    public double impot() {
        return this.surface * 0.155;
    }

    /**
     * Affiche toute les informations de la classe (propriétaire,adresse,surface)
     */
    public void affiche() {
        System.out.println("Propriétaire : " + this.proprietaire);
        System.out.println("Adresse : " + this.adresse);
        System.out.println("Surface : " + this.surface + " m²");
    }
}

