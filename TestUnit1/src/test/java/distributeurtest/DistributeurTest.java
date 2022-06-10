/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package distributeurtest;

import distributeur.Distributeur;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.Test;

/**
 *
 * @author CECILE
 */
public class DistributeurTest {
    
    
    @Test
    /**
     * test cas 1 - s'il y a bien 3 unités de stock
     */
    public void testRemplirLeStock(){
    Distributeur distributeur = new Distributeur();
        distributeur.remplirLeStock();
        assertEquals(3, distributeur.getStock().size());
    }
    
    @Test
    /**
     * test cas 2 - s'il y a bien 5€ dans variable credit
     */
    public void testInsererArgent(){
    Distributeur distributeur = new Distributeur();
        int montantInitial = distributeur.getCredit();
        distributeur.insererArgent(5);
        assertEquals(montantInitial+5,distributeur.getCredit());
    }
    
    @Test
    /**
     *  test cas 3 - achat produit café à 1€, insert 5€
     *  result - reste credit 4€ et quantité 4
     */
    public void testCommanderSoldeCredit(){
        Distributeur distributeur = new Distributeur();
        distributeur.remplirLeStock();
        distributeur.insererArgent(5);
        distributeur.commanderProduit(1);
        
        assertEquals(4, distributeur.getCredit());
        assertEquals(9, distributeur.getProduit(1).getQuantite());
    }
    
    @Test
    /**
     *  test cas 4 - Commande d'un produit Null
     */
    public void testCommanderProduitInexistant(){
        Distributeur distributeur = new Distributeur();
        distributeur.remplirLeStock();
        distributeur.insererArgent(5);
        //distributeur.commanderProduit(0);

        assertNull(distributeur.getProduit(0));
    }
    
    @Test
    /**
     *  test cas 5 - Commande produit quand credit est à 0
     */
    public void testCommanderProduitCreditZero(){
        Distributeur distributeur = new Distributeur();
        distributeur.remplirLeStock();
        distributeur.insererArgent(0);
        distributeur.commanderProduit(1);

        assertEquals(0, distributeur.getCredit());
        assertEquals(10, distributeur.getProduit(1).getQuantite());
    }
    
    @Test
    /**
     *  test cas 6 - Commande produit quand credit est inférieur au prix du produit
     */
    public void testCommanderProduitCreditInsuffisant(){
        Distributeur distributeur = new Distributeur();
        distributeur.remplirLeStock();
        distributeur.insererArgent(1);
        distributeur.commanderProduit(2);

        assertEquals(1, distributeur.getCredit());
        assertEquals(8, distributeur.getProduit(2).getQuantite());
    }
    
}
