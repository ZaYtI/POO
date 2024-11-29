package TP1.Exercice9;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class CountVowels {

    /**
     * 
     * @return retourne le dictionnaire 
     */
    public static LinkedHashMap<Character, Integer> initLinkedHashMap(){
        char[] arrayOfVowels = {'a', 'e', 'i', 'o', 'u', 'y'};//liste des voyelles
        LinkedHashMap<Character, Integer> vowelCounts = new LinkedHashMap<>();
        //On boucle sur la liste des voyelles
        for (char vowel : arrayOfVowels) {
            // On ajoute une nouvelle clef pour chaque valeur
            vowelCounts.put(vowel, 0);
        }
        return vowelCounts;
    }

    /**
     * Renvoie combien de fois chaque voyelles est contenue dans le mot
     * @param vowelCounts dictionnaire des voyelles
     * @param word mot entrer par l'utilisateur
     */
    public static void countVowels(LinkedHashMap<Character, Integer> vowelCounts,String word){
        // On boucle sur chacun des caractère du mot donner en le mettant en minuscule et en type char
        for (char c : word.toLowerCase().toCharArray()) {
            // Si il est contenue dans le dictionnaire 
            if (vowelCounts.containsKey(c)) {
                // On ajouter 1 a la valeur de clé
                vowelCounts.put(c, vowelCounts.get(c) + 1);
            }
        }
        System.out.println("Compteur pour chacune des voyelles:");
        // On boucle sur chaque clé du dictionnaire pour afficher le résultat
        for (char vowel : vowelCounts.keySet()) {
            System.out.printf("%c: %d%n",vowel,vowelCounts.get(vowel));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un mot ou une phrase : ");
        String word = scanner.nextLine();
        LinkedHashMap<Character, Integer> vowelCounts = initLinkedHashMap();//LinkedHashMap permet de créer un dictionnaire qui sera toujours renvoyer dans l'ordre dans lequel il a était instancier
        scanner.close();
        countVowels(vowelCounts, word);

    }
}
