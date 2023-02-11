package org.GenerationItaly.shopProject.model.specialModels;

import org.GenerationItaly.shopProject.model.Products;

public class DVD extends Products {
    private String title;
    private String categories;
    private int time;

    public DVD(){
        super();
    }
    public DVD(String title, String categories, double weight, double price, int time){
        super(weight, price);
        this.title=title;
        this.categories=categories;
        this.time=time;
    }

    public String getDVDTitle(){ return title;}

    public String getDVDCategories(){
        return categories;
    }

    public int getTime() { return time; }
}
