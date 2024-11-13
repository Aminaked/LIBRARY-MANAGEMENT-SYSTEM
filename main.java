

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        // Set up a Scanner to collect user input
    
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le nom de l'adhérent: ");
        String nom = scanner.nextLine();

        System.out.print("Entrez le prénom de l'adhérent: ");
        String prenom = scanner.nextLine();

    
        System.out.print("Entrez l'adresse de l'adhérent: ");
        String adr = scanner.nextLine();

        System.out.print("Entrez num de l'adhérent: ");
        String num_ins = scanner.nextLine();

        adherent adherent= new adherent(nom, prenom, adr, num_ins);
        // Pass the input values to inscrireAdherent method to add to the database

        registerMember.registerMember(adherent);
DataBaseConnection.getConnection();
registerMember.registerMember(adherent);
        System.out.println("New User Sign up: " +adherent.toString());

        scanner.close();
    }
}

