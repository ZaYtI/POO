package TP2.Serie1;

class TestHabitation {
    public static void main(String[] args) {
        double impot;
        Habitation Habitation = new Habitation("Dupont", "Valenciennes", 120);
        impot = Habitation.impot();
        Habitation.affiche();
        System.out.println("Impôt = " + impot + " euros");
    }
}
