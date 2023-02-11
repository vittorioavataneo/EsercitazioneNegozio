package org.GenerationItaly.shopProject.model.specialModels;

import org.GenerationItaly.shopProject.model.Products;

public class PadelRackets extends Products {
    private String brand;
    private String type;
    public PadelRackets(){
        super();
    }
    public PadelRackets(String brand, double weight, double price, String type){
        super(weight, price);
        this.brand=brand;
        this.setType(type);
        this.type=type;
    }

    public String getBrand() { return brand; }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        if(type.equalsIgnoreCase("Goccia") || type.equalsIgnoreCase("Rotonda")
                || type.equalsIgnoreCase("Diamante")){
            this.type = type;
        } else System.out.println("Non esiste questo tipo di racchetta da paddle");
    }
}
