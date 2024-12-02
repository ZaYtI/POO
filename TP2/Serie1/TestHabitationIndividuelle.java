package TP2.Serie1;

class TestHabitationIndividuelle {
    public static void main(String[] args) {
        double impot;
        // Création de l'habitation indiv
        HabitationIndividuelle habitationIndividuelle = new HabitationIndividuelle("Dupont", "Valenciennes", 120, 3, true);
        // Récupération de l'impot de celle ci
        impot = habitationIndividuelle.impot();
        // Affichage des différentes informations de l'habitation indiv
        habitationIndividuelle.affiche();
        // Affichage de l'impot
        System.out.println("Impôt = " + impot + " euros");
    }
}
