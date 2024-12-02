package service;

import model.Food;
import model.constants.Discount;

public class ShoppingCart {
    private Food [] arrayFoods;
    private double summProductsNonDiscount;


    public ShoppingCart (Food[] arrayFoods) {
        this.arrayFoods = new Food[arrayFoods.length];
        for (int i = 0; i < arrayFoods.length; i++) {
            this.arrayFoods[i] = arrayFoods[i];
        }
    }

    public double getSummproductsNonDiscount () {

        for (int i = 0; i < this.arrayFoods.length; i++) {
                summProductsNonDiscount = summProductsNonDiscount + this.arrayFoods[i].getAmount() * this.arrayFoods[i].getPrice();
        }
        return summProductsNonDiscount;
    }

    public double getSummproductsDiscount () {
        double SummproductsDiscount = 0;
        for (int i = 0; i < this.arrayFoods.length; i++) {
            if (this.arrayFoods[i].getDiscount() != 0) {
                SummproductsDiscount = summProductsNonDiscount - ((this.arrayFoods[i].getAmount() * this.arrayFoods[i].getPrice()) * Discount.RED_APPLE_DISCOUNT);
            }
        }
        return SummproductsDiscount;
    }

    public double getSummVeganProductsNonDiscount () {
        double SummVeganProductsNonDiscount = 0;
        for (int i = 0; i < this.arrayFoods.length; i++) {
            if (this.arrayFoods[i].isVegetarian()) {
                SummVeganProductsNonDiscount = SummVeganProductsNonDiscount + this.arrayFoods[i].getAmount() * this.arrayFoods[i].getPrice();
            }
        }
        return SummVeganProductsNonDiscount;
    }

}




