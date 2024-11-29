import java.util.Scanner;
import java.util.Random;

public class JeuDevinette {
    public static void main(String[] args) {
        
        Random random = new Random();
        int nombreSecret = random.nextInt(1000) + 1;

        
        int[] arrayOfProposals = new int[10];
        int index = 0; 

        
        Scanner scanner = new Scanner(System.in);
        int essaisRestants = 10;
        boolean aGagne = false;

        System.out.println("J'ai choisi un nombre entre 1 et 1000.");
        System.out.println("Vous avez 10 essais pour le deviner.");

        while (essaisRestants > 0 && !aGagne) {
            System.out.println("\nEntrez votre proposition : ");
            int proposition = scanner.nextInt();

            
            arrayOfProposals[index] = proposition;
            index++;
            essaisRestants--;

            if (proposition == nombreSecret) {
                System.out.println("Bravo ! Vous avez deviné le nombre " + nombreSecret + " !");
                aGagne = true;
            } else if (proposition < nombreSecret) {
                System.out.println("Trop petit !");
            } else {
                System.out.println("Trop grand !");
            }

            
            System.out.print("Vos propositions jusqu'à présent : ");
            for (int i = 0; i < index; i++) {
                System.out.print(arrayOfProposals[i] + " ");
            }
            System.out.println();

            if (essaisRestants > 0 && !aGagne) {
                System.out.println("Il vous reste " + essaisRestants + " essais.");
            } else if (!aGagne) {
                System.out.println("Désolé, vous n'avez plus d'essais.");
            }
        }

        if (!aGagne) {
            System.out.println("Le nombre à deviner était : " + nombreSecret);
        }
        scanner.close();
    }
}
