package model;

public class Meat extends Food {



    public Meat (int amount, double price) {
        super (amount, price, false);
    }

    @Override
    public void take() {
        if (!isVegetarian()) {
            System.out.println ("Мясо в количестве " + this.getAmount() + " " + this.getPrice() + " кг");
        };

    }
}
