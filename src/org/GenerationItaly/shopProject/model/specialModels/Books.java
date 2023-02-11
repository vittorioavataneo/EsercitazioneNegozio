package org.GenerationItaly.shopProject.model.specialModels;

import org.GenerationItaly.shopProject.model.Products;

public class Books extends Products{
    private String title;
    private String categories;
    private String ISBN;
    private int pages;
    public Books(){ super();}
    public Books(String title, String categories, double weight, double price, String ISBN, int pages){
        super(weight, price);
        this.title=title;
        this.categories=categories;
        this.ISBN=ISBN;
        this.pages=pages;
    }
    public String getBookTitle(){ return title; }
    public String getCategories(){
        return categories;
    }
    public String getISBN() {
        return ISBN;
    }
    public int getPages() {
        return pages;
    }
}
