package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    boolean isaddcheese;

    boolean isaddtoppings;
    boolean istakeway;
    boolean isgetbill;
    int ExtraCheesePrice;
    int ToppingsPrice;
    int PaperbagPrice;


    public Pizza(Boolean isVeg){
        this.ExtraCheesePrice = 80;
        this.PaperbagPrice = 20;


        this.isVeg = isVeg;
        if(isVeg==true){
            this.price=300;
            this.ToppingsPrice = 70;
        }
        else{
            this.price=400;
            this.ToppingsPrice=120;
        }
        this.isaddtoppings=false;
        this.isaddcheese=false;
        this.istakeway=false;
        this.isgetbill=false;
        this.bill="Base Price Of The Pizza: "+this.price+"\n";
        // your code goes here
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(isaddcheese==false){
            this.price=this.price+ExtraCheesePrice;
        }
        isaddcheese=true;
    }

    public void addExtraToppings() {
        // your code goes here
        if(isaddtoppings) {
            this.price = this.price + ToppingsPrice;
        }
        isaddtoppings=true;
     }

    public void addTakeaway(){
        // your code goes here
        if(istakeway){
            this.price=this.price+PaperbagPrice;
        }
        istakeway=true;
    }

    public String getBill(){
        // your code goes here
        if(isgetbill) {
            if (isaddcheese)
                this.bill = this.bill + "Extra Cheese Added: " + ExtraCheesePrice + "\n";

            if (isaddtoppings)
                this.bill = this.bill + "Extra Toppings Added: " + ToppingsPrice + "\n";
            if (istakeway)
                this.bill = this.bill + "Paperbag Added: " + PaperbagPrice + "\n";
            this.bill += "Total price: " + this.price;



        }
        isgetbill=true;

        return this.bill;

    }
}
