package org.GenerationItaly.shopProject.infrastructure;

import org.GenerationItaly.shopProject.model.Products;
import org.GenerationItaly.shopProject.model.specialModels.Books;
import org.GenerationItaly.shopProject.model.specialModels.DVD;
import org.GenerationItaly.shopProject.model.specialModels.PadelRackets;

import java.util.ArrayList;

public class Shop {
    private ArrayList<Products> stock;
    private ArrayList<PadelRackets> stockPadelRacket;

    public Shop(){
        this.stock= new ArrayList<>();
        this.stockPadelRacket = new ArrayList<>();
    }
    public void addProduct(Products product){
        stock.add(product);
    }

    public int productsInShop(){
        return stock.size();
    }
    public double howHeavy(){
        double totalWeight=0;
        for(Products products : stock){
            totalWeight+=products.getWeight();
        }
        return totalWeight;
    }

    public String whichMostExpensive(){
        Products mostExpensive=stock.get(0);
        for(int i=1; i<stock.size(); i++){
            if(stock.get(i).getPrice() > stock.get(i-1).getPrice()){
                mostExpensive=stock.get(i);
            }
        }
        if (mostExpensive instanceof Books){
            Books mostExpensiveBook = (Books) mostExpensive;
            return mostExpensiveBook.getBookTitle();
        } else if (mostExpensive instanceof DVD) {
            DVD mostExpensiveDVD = (DVD) mostExpensive;
            return mostExpensiveDVD.getDVDTitle();
        }else {
            PadelRackets mostExpensiveRacket = (PadelRackets) mostExpensive;
            return mostExpensiveRacket.getBrand();
        }
    }

    public int howManyFantasy(){
        int numberOfFantasy=0;
        for(Products prod : stock){
            if (prod instanceof Books) {
                Books book = (Books)prod;
                if (book.getCategories().equalsIgnoreCase("Fantasy")) {
                    numberOfFantasy += 1;
                }
            }
        }
        return  numberOfFantasy;
    }

    public void howManyPriceyDropRackets() {
        for (Products prod : stock) {
            if (prod instanceof PadelRackets) {
                PadelRackets racket = (PadelRackets) prod;
                if (racket.getType().equalsIgnoreCase("Goccia") && racket.getPrice() > 100) {
                    stockPadelRacket.add(racket);
                }
            }
        }
        for (PadelRackets racket : stockPadelRacket) {
            if (racket instanceof PadelRackets) {
                PadelRackets rackets = (PadelRackets) racket;
                System.out.println(rackets.getBrand());
            }
        }
    }

}
