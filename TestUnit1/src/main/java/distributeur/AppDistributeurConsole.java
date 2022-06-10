package distributeur;

import java.util.Scanner;

public class AppDistributeurConsole {
    
    
    public static void main(String[] args) {

    Distributeur distributeur = new Distributeur();
    distributeur.remplirLeStock();
    Scanner clavier = new Scanner(System.in);
    
    // bool pour sortir de la boucle
    boolean terminer = false;
    while (! terminer){
        System.out.println( "Vous disposez de : " + distributeur.getCredit() + "€ \n" );
        System.out.println( "1. Insérer de l'argent" );
        System.out.println( "2. Acheter" );
        System.out.println( "3. Récupérer Argent" );
        System.out.println( "4. Quitter" );
        
        int choix = clavier.nextInt();
        
        switch (choix) {
            case 1 -> {
                System.out.println( "Quel montant ?" );
                int montant = clavier.nextInt();
                distributeur.insererArgent(montant);
            }
            case 2 -> {
                // affiche que s'il y a la quantité
                for ( Produit produit: distributeur.getStock() ){
                    // getStock affiche un tableau !
                    System.out.println( " > " + produit.getId() + " <  " + produit.getNom() + " : " + produit.getPrix() + "€"  + "  (reste : " + produit.getQuantite() + ")");
                }
                System.out.println( "\nChoisissez le numéro du produit ?" );
                int choixProduit = clavier.nextInt();
                distributeur.commanderProduit(choixProduit);
            }
            case 3 -> {
                System.out.println( "Vous pouvez récupérer votre solde de : " + distributeur.getCredit() + "€ \n" );
                distributeur.recupererArgentRestant();
            }
            case 4 -> {
                System.out.println("Au revoir !");
                distributeur.recupererArgentRestant();
                terminer = true;
            }
            default -> System.out.println("Erreur");
        }
    }

}
    
    
}
