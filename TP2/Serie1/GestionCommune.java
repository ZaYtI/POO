package TP2.Serie1;

public class GestionCommune {

    public static void main(String[] args) {
        Habitation[] habitations = new Habitation[5];

        habitations[0] = new HabitationProfessionnelle("Pierre", "Paris", 2500, 130);
        habitations[1] = new HabitationProfessionnelle("Julien", "Lyon", 250, 10);
        habitations[2] = new HabitationIndividuelle("Olivier", "Lyon", 100, 5, false);
        habitations[3] = new HabitationProfessionnelle("Lucas", "Marseille", 1200, 90);
        habitations[4] = new HabitationIndividuelle("Thomas", "Nice", 130, 6, true);

        for (Habitation habitation : habitations) {
            habitation.affiche();
            System.out.println("Impôt = " + habitation.impot() + " euros\n");
        }
    }
}
