package ru.geekbrains.lesson1;

public class Chocolate extends Product{
    /**
     * 1. Создать новый продукт на основе Product, создать ему хотя бы одно свойство
     * (например, шоколад -> калории) и включить в список продуктов в вендинг машину.
     * 2. Продемонстрировать работу класса по продаже товаров (как мы это делали на семинаре).
     */
    private int colories;

    private int weigth;

    public int getWeigth() {
        return weigth;
    }

    public int getColories() {
        return colories;
    }

    public Chocolate(String brand, String name, double price, int colories,int weigth) {
        super(brand, name, price);
        this.colories = colories;
        this.weigth = weigth;
        if (this.weigth < 50) this.price = price;
    }

    @Override
    public String displayInfo() {
        return String.format("[Шоколадка]\n%s - %s - %.2f;\nВес: %d, Энергетическая ценность %d каллорий",
                brand, name, price, weigth, colories);
    }
}
