package org.GenerationItaly.shopProject.infrastructure;

import org.GenerationItaly.shopProject.model.specialModels.Books;
import org.GenerationItaly.shopProject.model.specialModels.DVD;
import org.GenerationItaly.shopProject.model.specialModels.PadelRackets;

public class ApplicationStartShop {
    public static void main(String[] args) {

        Shop shop1= new Shop();

        Books b1 = new Books("Lord of the rings", "Fantasy", 0.6,
                39.99, "9780686527008", 1240);
        Books b2 = new Books("The Ultimate Hitchhiker's Guide of the Galaxy", "Sci-Fi", 0.17,
                19.99, "9780345453747", 224);
        Books b3 = new Books("The Hobbit", "Fantasy", 0.3, 29.99,
                "9780048232731", 310);
        Books b4 = new Books("Jurassic Park", "Science fiction", 0.2, 19.99,
                "9780307348135", 492);

        DVD d1 = new DVD("Star Wars: Episode III – Revenge of the Sith",
                "Sci-Fi", 0.3, 9.99, 150);
        DVD d2 = new DVD("The Imitation Game",
                "Historic", 0.25, 9.99, 114);
        DVD d3 = new DVD("Star Trek",
                "Sci-Fi", 0.28, 5.99, 143);
        DVD d4 = new DVD("Matrix",
                "Sci-Fi", 0.27, 9.99, 136);

        PadelRackets p1 = new PadelRackets("Starvie", 0.34, 341.99, "Goccia");
        PadelRackets p2 = new PadelRackets("Babolat", 0.39, 75.99, "Goccia");
        PadelRackets p3 = new PadelRackets("Tsunami", 0.36, 349.99, "Rotonda");
        PadelRackets p4 = new PadelRackets("Wilson", 0.35, 264.95, "Goccia");

        shop1.addProduct(b1);
        shop1.addProduct(b2);
        shop1.addProduct(b3);
        shop1.addProduct(b4);
        shop1.addProduct(d1);
        shop1.addProduct(d2);
        shop1.addProduct(d3);
        shop1.addProduct(d4);
        shop1.addProduct(p1);
        shop1.addProduct(p2);
        shop1.addProduct(p3);
        shop1.addProduct(p4);

        System.out.println("Ho "+shop1.productsInShop()+" prodotti in negozio.");
        System.out.println("Il peso totale del mio stock è di "+ shop1.howHeavy()+ " kg.");
        System.out.println("Il prodotto più costoso del negozio è " +shop1.whichMostExpensive()+".");
        System.out.println("Ci sono "+ shop1.howManyFantasy() +" libri fantasy.");

        shop1.howManyPriceyDropRackets();
    }

}
