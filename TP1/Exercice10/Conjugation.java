package TP1.Exercice10;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class Conjugation {

    /**
     * Initialise un dictionnaire (LinkedHashMap) associant les pronoms sujets
     * avec leurs terminaisons respectives pour les verbes du premier groupe au présent.
     *
     * @return Un LinkedHashMap contenant les pronoms sujets et leurs terminaisons.
     */
    public static LinkedHashMap<String, String> initLinkedHashMap() {
        // Crée une instance de LinkedHashMap pour conserver l'ordre d'insertion
        LinkedHashMap<String, String> pronomTerminaisonDict = new LinkedHashMap<>();

        // Ajoute les pronoms sujets et leurs terminaisons respectives
        pronomTerminaisonDict.put("je", "e");
        pronomTerminaisonDict.put("tu", "es");
        pronomTerminaisonDict.put("il/elle/on", "e");
        pronomTerminaisonDict.put("nous", "ons");
        pronomTerminaisonDict.put("vous", "ez");
        pronomTerminaisonDict.put("ils/elles", "ent");

        return pronomTerminaisonDict; // Retourne le dictionnaire initialisé
    }

    /**
     * Affiche la conjugaison d'un verbe régulier du premier groupe au présent.
     *
     * @param pronomTerminaisonDict Le dictionnaire des pronoms et terminaisons.
     * @param verb Le verbe à conjuguer.
     */
    public static void displayConjugation(LinkedHashMap<String, String> pronomTerminaisonDict, String verb) {
        String radicalVerb = verb.substring(0, verb.length() - 2);

        System.out.printf("Conjugaison du verbe %s au présent :\n", verb);

        // Parcourt chaque pronom et sa terminaison dans le dictionnaire
        for (String pronom : pronomTerminaisonDict.keySet()) {
            String terminaison = pronomTerminaisonDict.get(pronom);
            String literalVerb = radicalVerb + terminaison;
            System.out.printf("%s %s%n", pronom, literalVerb);
        }
    }

    public static void main(String[] args) {
        // Initialisation d'un Scanner pour la saisie utilisateur
        Scanner scanner = new Scanner(System.in);
        // Initialise le dictionnaire des pronoms et terminaisons
        LinkedHashMap<String, String> pronomTerminaisonDict = initLinkedHashMap();
        Boolean isValidVerb = false; 
        String verb = "";

        // Boucle pour demander un verbe valide
        while (!isValidVerb) {
            System.out.print("Entrer un verbe du premier groupe (régulier): ");
            verb = scanner.nextLine(); // Lit la saisie utilisateur

            // Vérifie si le verbe est valide (se termine par "er" et a plus de 2 caractères)
            if (verb.endsWith("er") && verb.length() > 2) {
                isValidVerb = true;
            } else {
                System.out.println("Le verbe doit se terminer par er");
            }
        }
        scanner.close();

        displayConjugation(pronomTerminaisonDict, verb);
    }
}
