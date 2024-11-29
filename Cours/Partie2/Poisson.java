package Cours.Partie2;

public class Poisson extends Animal {

    public Boolean riviere;

    public Boolean mer;

    public Poisson(String nom,Boolean riviere,Boolean mer){
        super(nom);
        this.riviere = riviere;
        this.mer = mer;
    }


    public Poisson(String nom){
        super(nom);
    }

    @Override
    public String toString(){
        return "Poisson {"+" riviere: "+this.riviere+" mer: "+this.mer+"}";
    }
}
