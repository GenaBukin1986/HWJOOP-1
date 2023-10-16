package ru.geekbrains.lesson1;

import java.util.List;

public class VendingMachine {

    private List<Product> products;

    public VendingMachine(List<Product> products) {
        this.products = products;
    }

    public BottleOfMilk getBottleOfMilk(String name, double volume){
        for (Product product: products) {
            if (product instanceof BottleOfMilk){
                BottleOfMilk bottleOfMilk = (BottleOfMilk)product;
                if (bottleOfMilk.getName().equals(name) && bottleOfMilk.getVolume() == volume){
                    return bottleOfMilk;
                }
            }
        }
        return null;
    }
    public Chocolate getChocolate(String name, double price,int colories){
        for(Product product: products){
            if (product instanceof Chocolate){
                Chocolate chocolate = (Chocolate) product;
                if (chocolate.price == price && chocolate.name.equals(name) && chocolate.getColories() == colories) return chocolate;
            }
        }
        return null;
    }


}
