package ru.geekbrains.lesson1;

import java.util.ArrayList;

public class Program {

    public static void main(String[] args) {

        Product product3 = new Product("Производитель #2", "Продукт #2", 325);

        Product bottleOfWater = new BottleOfWater("ООО Источник", "Бутылка с водой #1", 200, 1.5);

        Product bottleOfMilk1 = new BottleOfMilk("ООО Источник", "Бутылка с молоком #1", 220, 1.5, 25);

        Product bottleOfMilk2 = new BottleOfMilk("ООО Источник", "Бутылка с молоком #2", 120, 1.0, 15);

        Product bottleOfMilk3 = new BottleOfMilk("ООО Источник", "Бутылка с молоком #3", 320, 1.0, 15);

        Product chocolate1 = new Chocolate("Красный Октябрь", "Шоколадка #1", 75, 2500, 25);
//        System.out.println(chocolate1.displayInfo());

        Product chocolate2 = new Chocolate("Рок-Фронт", "Шоколодка #2", 64, 3000, 51);
//        System.out.println(chocolate2.displayInfo());


        ArrayList<Product> products = new ArrayList<>();
        products.add(bottleOfWater);
        products.add(bottleOfMilk1);
        products.add(bottleOfMilk2);
        products.add(bottleOfMilk3);
        products.add(chocolate1);
        products.add(chocolate2);



        VendingMachine vendingMachine = new VendingMachine(products);
        BottleOfMilk bottleOfMilk = vendingMachine.getBottleOfMilk("Бутылка с молоком #2", 0.5);
        if (bottleOfMilk == null){
            System.out.println("Такой бутылки с молоком нет в  автомате.");
        }
        else {
            System.out.println("Вы купили:");
            System.out.println(bottleOfMilk.displayInfo());
        }

        Chocolate chocolate = vendingMachine.getChocolate("Шоколадка #1", 75.0, 2500);
        if (chocolate == null){
            System.out.println("Такой шоколадки нет в автомате!\nПопробуйте выбрать из того, что есть.");
        }
        else {
            System.out.println("Вы купили: ");
            System.out.println(chocolate.displayInfo());
            products.remove(chocolate); // минус одна шоколадка)
        }
        System.out.println();
        Chocolate chocolatik = vendingMachine.getChocolate("Шоколадка #1", 75.0, 2500);
        if (chocolatik == null){
            System.out.println("Такой шоколадки нет в автомате!\nПопробуйте выбрать из того, что есть.");
        }
        else {
            System.out.println("Вы купили: ");
            System.out.println(chocolatik.displayInfo());
            products.remove(chocolatik); // минус одна шоколадка)
        }

    }

}
