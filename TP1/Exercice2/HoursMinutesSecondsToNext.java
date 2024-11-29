package TP1.Exercice2;

import java.util.Scanner;

public class HoursMinutesSecondsToNext {

    public static void next(int hours,int minutes,int secondes){
        secondes ++;
        if(secondes > 59){
            secondes = 0;
            minutes ++;
            if(minutes > 59){
                minutes = 0;
                hours ++;
                if(hours > 23){
                    hours = 0;
                }
            }
        }

        System.out.printf("La seconde suivante %dh:%dm:%ds%n",hours,minutes,secondes);
    }
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.print("Entrer le nombre d'heure: ");

            int hours = scanner.nextInt();

            if(hours > 23){
                throw new Exception("Nombre d'heure invalide");
            }

            System.out.print("Entrer un nombre de minutes: ");

            int minutes = scanner.nextInt();

            if(minutes > 59){
                throw new Exception("Nombre de minutes invalide");
            }

            System.out.print("Entrer un nombre de minutes: ");

            int secondes = scanner.nextInt();

            if(secondes > 59 ){
                throw new Exception("Nombre de minutes invalide");
            }

            next(hours, minutes, secondes);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally{
            scanner.close();
        }
    }
}
