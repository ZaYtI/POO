package TP1.Exercice10;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class Conjugation {

    public static LinkedHashMap<String, String> initLinkedHashMap() {
        LinkedHashMap<String, String> pronomTerminaisonDict = new LinkedHashMap<>();

        pronomTerminaisonDict.put("je", "e");
        pronomTerminaisonDict.put("tu", "es");
        pronomTerminaisonDict.put("il/elle/on", "e");
        pronomTerminaisonDict.put("nous", "ons");
        pronomTerminaisonDict.put("vous", "ez");
        pronomTerminaisonDict.put("ils/elles", "ent");

        return pronomTerminaisonDict;
    }

    public static void displayConjugation(LinkedHashMap<String, String> pronomTerminaisonDict,String verb){
        String radicalVerb = verb.substring(0, verb.length() - 2);

        System.out.printf("Conjugaison du verbe %s au présent :\n",verb);
        for (String pronom : pronomTerminaisonDict.keySet()) {
            String terminaison = pronomTerminaisonDict.get(pronom);
            String literalVerb = radicalVerb+terminaison;
            System.out.printf("%s %s%n",pronom,literalVerb);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashMap<String, String> pronomTerminaisonDict = initLinkedHashMap();
        boolean isValidVerb = false;
        String verb = "";

        while (!isValidVerb) {
            System.out.print("Entrer un verbe du premier groupe (régulier): ");
            verb = scanner.nextLine();

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
