package model;


import model.constants.Discount;

public abstract class Food implements Discountable{
    private int amount;
    private double price;
    private boolean isVegetarian;


    public Food (int amount, double price, boolean isVegetarian) {
        this.amount = amount;
        this.price = price;
        this.isVegetarian = isVegetarian;
    }

    public int getAmount() {
        return amount;
    }

    public double getPrice() {
        return price;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }


    @Override
    public double getDiscount() {
        return Discount.DEFAULT_DISCOUNT;
    }


    public void take() {
    }
}
