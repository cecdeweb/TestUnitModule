/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package distributeur;

import java.util.ArrayList;

/**
 *
 * @author CECILE
 */
public class Distributeur {
  
        private int credit = 0; // credit machine  avant insert money
        private ArrayList<Produit> stock = new ArrayList<>(); // état du stock

    public Distributeur(){
        credit = 0;
    }
        public void remplirLeStock(){
        stock.add(new Produit(1, "café", 1, 10));
        stock.add(new Produit(2, "soda", 2, 8));
        stock.add(new Produit(3, "barre céréales", 3, 20));
    }

    public void insererArgent(int montant){
      credit += montant;
    }
    
    public void commanderProduit(int id){
        for (Produit produit: stock){
            if (produit.getId() == id){
                if (credit >= produit.getPrix() && produit.getQuantite()>=1){
                    produit.setQuantite(produit.getQuantite()-1);
                    credit = credit - produit.getPrix();
                }
            }
        }
    }
            
    public void recupererArgentRestant(){
        credit = 0;        
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public ArrayList<Produit> getStock() {
        return stock;
    }

    public void setStock(ArrayList<Produit> stock) {
        this.stock = stock;
    }
    
    public Produit getProduit(int id){
        for (Produit produit: stock){
            if (produit.getId() == id){
                return produit;
            }
        } 
      return null;
    }
    
}
