package TP1.Exercice9;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class CountVowels {

    public static LinkedHashMap<Character, Integer> initLinkedHashMap(){
        char[] arrayOfVowels = {'a', 'e', 'i', 'o', 'u', 'y'};
        LinkedHashMap<Character, Integer> vowelCounts = new LinkedHashMap<>();
        for (char vowel : arrayOfVowels) {
            vowelCounts.put(vowel, 0);
        }
        return vowelCounts;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un mot ou une phrase : ");
        String word = scanner.nextLine();
        LinkedHashMap<Character, Integer> vowelCounts = initLinkedHashMap();
        for (char c : word.toLowerCase().toCharArray()) {
            if (vowelCounts.containsKey(c)) {
                vowelCounts.put(c, vowelCounts.get(c) + 1);
            }
        }
        scanner.close();
        System.out.println("Compteur pour chacune des voyelles:");
        for (char vowel : vowelCounts.keySet()) {
            System.out.printf("%c: %d%n",vowel,vowelCounts.get(vowel));
        }
    }
}
