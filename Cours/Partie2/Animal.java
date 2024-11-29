package Cours.Partie2;

public class Animal {
    private String nom;

    public Animal(String nom){
        this.nom = nom;
    }

    @Override
    public String toString(){
        return "Animal {"+"nom: "+this.nom+"}";
    }
}
