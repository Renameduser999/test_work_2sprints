package main;

import model.Apple;
import model.Food;
import model.Meat;
import model.constants.Colour;
import service.ShoppingCart;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Meat meat = new Meat(5, 100);
        Apple appleRed = new Apple(10, 50, Colour.RED_APPLES);
        Apple appleGreen = new Apple(8, 60, Colour.GREEN_APPLES);

        Food [] goodFoods = new Food[3];
        goodFoods [0] = meat;
        goodFoods [1] = appleRed;
        goodFoods [2] = appleGreen;

        ShoppingCart shoppingCart = new ShoppingCart(goodFoods);

        System.out.println("Общая сумму товаров без скидки " + shoppingCart.getSummproductsNonDiscount());
        System.out.println("Общая сумму товаров со скидкой " + shoppingCart.getSummproductsDiscount());
        System.out.println("Сумма всех вегетарианских продуктов без скидки " + shoppingCart.getSummVeganProductsNonDiscount() );
    }




}

