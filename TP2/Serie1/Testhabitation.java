package TP2.Serie1;

class TestHabitation {
    public static void main(String[] args) {
        double impot;
        // Initialisation de l'habitation
        Habitation Habitation = new Habitation("Dupont", "Valenciennes", 120);
        // Récupération de l'impot de l'habitation
        impot = Habitation.impot();
        Habitation.affiche();
        // Affichage de l'impot
        System.out.println("Impôt = " + impot + " euros");
    }
}
