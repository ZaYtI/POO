package Cours.Partie2;

public class Oiseau extends Animal{
    private String couleur;

    public Oiseau(String nom){
        super(nom);
    }

    public Oiseau(String nom,String couleur){
        super(nom);
        this.couleur = couleur;
    }

    @Override
    public String toString(){
        return "Oiseau {"+" couleur: "+this.couleur+"}";
    }
}
