package ru.job4j.pojo;

/**
 * @author Iuriy Gaydarzhi.
 * @since 02.07.2021
 */
public class ShopDrop {

    /**
     * Метод принимает индекс ячейки, которую необходимо удалить и все ячейки,
     * стоящие справа от удаляемой перемещает на одну ячейку влево.
     *
     * @param products Входящий массив.
     * @param index    Индекс ячейки которую нужно удалить.
     * @return Новый массив.
     */
    public static Product[] delete(Product[] products, int index) {
        for (int i = index; i < products.length - 1; i++) {
            products[i] = products[i + 1];
        }
        products[products.length - 1] = null;
        return products;
    }
}
