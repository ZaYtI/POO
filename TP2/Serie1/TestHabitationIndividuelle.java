package TP2.Serie1;

class TestHabitationIndividuelle {
    public static void main(String[] args) {
        double impot;
        HabitationIndividuelle habitationIndividuelle = new HabitationIndividuelle("Dupont", "Valenciennes", 120, 3, true);
        impot = habitationIndividuelle.impot();
        habitationIndividuelle.affiche();
        System.out.println("Impôt = " + impot + " euros");
    }
}
