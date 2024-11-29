import java.util.Scanner;

public class ConvertToDegrees {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez un entier à convertir en degrés:");
        int input = scanner.nextInt();

        double degrees = (double) input;

        System.out.println("La valeur convertie en degrés est : " + degrees);

        scanner.close();
    }
}
