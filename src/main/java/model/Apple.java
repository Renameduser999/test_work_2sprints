package model;

import model.constants.Colour;
import model.constants.Discount;

import java.util.Objects;

public class Apple extends Food {

    private final String colour;

    public Apple (int amount, double price,  String colour) {
        super (amount, price, true);
        this.colour = colour;
    }

    @Override
    public double getDiscount() {
        if (Objects.equals(this.colour, Colour.RED_APPLES)) {
            return this.getPrice() * Discount.RED_APPLE_DISCOUNT/100;
        } else {
            return Discount.DEFAULT_DISCOUNT;
        }
    }



}
