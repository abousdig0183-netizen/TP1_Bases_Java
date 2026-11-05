package tp1;

import java.util.Scanner;

public class Main {

    // Methode pour l'addition
    public static int addition(int... nombres) {
        int resultat = 0;

        for (int nombre : nombres) {
            resultat += nombre;
        }

        return resultat;
    }

    // Methode pour la multiplication
    public static int multiplication(int... nombres) {
        int resultat = 1;

        for (int nombre : nombres) {
            resultat *= nombre;
        }

        return resultat;
    }

    // Methode pour calculer la moyenne
    public static double moyenne(int... nombres) {
        int somme = addition(nombres);

        return (double) somme / nombres.length;
    }

    // Methode pour trouver le plus grand nombre
    public static int plusGrand(int... nombres) {
        int maximum = nombres[0];

        for (int nombre : nombres) {
            if (nombre > maximum) {
                maximum = nombre;
            }
        }

        return maximum;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int choix;

        while (true) {

            System.out.println("\n===== MENU PRINCIPAL =====");
            System.out.println("1. Addition");
            System.out.println("2. Multiplication");
            System.out.println("3. Moyenne");
            System.out.println("4. Trouver le plus grand");
            System.out.println("0. Quitter");
            System.out.print("Votre choix : ");

            choix = scanner.nextInt();

            if (choix == 0) {
                System.out.println("Au revoir !");
                break;
            }

            if (choix < 1 || choix > 4) {
                System.out.println("Choix invalide !");
                continue;
            }

            System.out.print("Entrez le premier nombre : ");
            int n1 = scanner.nextInt();

            System.out.print("Entrez le deuxieme nombre : ");
            int n2 = scanner.nextInt();

            switch (choix) {

                case 1:
                    System.out.println("Resultat = " + addition(n1, n2));
                    break;

                case 2:
                    System.out.println("Resultat = " + multiplication(n1, n2));
                    break;

                case 3:
                    System.out.println("Moyenne = " + moyenne(n1, n2));
                    break;

                case 4:
                    System.out.println("Le plus grand = " + plusGrand(n1, n2));
                    break;
            }
        }

        scanner.close();
    }
}