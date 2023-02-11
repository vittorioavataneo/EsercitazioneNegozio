package org.GenerationItaly.shopProject.model;

import org.GenerationItaly.shopProject.model.specialModels.Books;
import org.GenerationItaly.shopProject.model.specialModels.DVD;
import org.GenerationItaly.shopProject.model.specialModels.PadelRackets;

import java.util.ArrayList;

public class Shop {
    private static ArrayList<Products> stock;
    public static void main(String[] args) {

        Books b1 = new Books("Lord of the rings", "Fantasy", 0.5,
                29.99, "9780686527008", 1240);
        DVD d1 = new DVD("Star Wars: Episode III – Revenge of the Sith",
                "Sci-Fi", 0.3, 9.99, 2.2);
        PadelRackets p1 = new PadelRackets("Starvie ", 1.2, 341.99, "Goccia");

        stock.add(b1);
        Shop.productInShop();
    }
    public Shop(){
        this.stock= new ArrayList<>();
    }

    public void addProduct(Products p){
        stock.add(p);
        System.out.println("ho aggiunto" + p);
    }

    public static int productInShop(){
        return stock.size();
    }

}
