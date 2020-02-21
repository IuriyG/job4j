package ru.job4j.pojo;

/**
 * 1. Напишите метод в классе ru.job4j.pojo.Shop.
 * public Product[] delete(Product[] products, int index);
 * Необходимо сместить все элементы на одну позицию влево, чтобы в массиве не было дырки.
 * Для того, чтобы сместить все элементы влево на одну позицию нужно использовать цикл for + index.
 * products[index] = products[index + 1];
 * После цикла нужно поставить на последнее место в массиве null, чтобы последний и предпоследний элементы не дублировались
 * products[products.length - 1] = null;
 * 2. Добавьте демонстрацию работы примера в метод main.
 */

public class Shop {
    public static void main(String[] args) {
        Product[] products = new Product[5];

        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        products[2] = new Product("Egg", 9);
        products[3] = new Product("Oil", 15);
        products[4] = new Product("Pepper", 23);
        delete(products, 5);
        for (Product product : products) {
            if (product != null) {
                System.out.println(product.getName());
            } else System.out.println("null");
        }
    }

    /**
     * Метод смещает элементы массива на одну ячейку влево, а последнюю заполняет null ссылкой.
     *
     * @param products Аргумент принимает массив.
     * @param index    Аргумент принимает количество продуктов в массиве.
     * @return Возвращает отсортированный массив.
     */
    public static Product[] delete(Product[] products, int index) {
        for (int i = 0; i < products.length - 1; i++) {
            products[i] = products[i + 1];
        }
        products[index - 1] = null;
        return products;
    }
}
