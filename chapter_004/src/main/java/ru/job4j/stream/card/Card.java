package ru.job4j.stream.card;


import java.util.stream.Stream;

/**
 * Класс формирует колоду карт.
 *
 * @author Iuriy Gaydarzhi.
 * @since 07.10.2021
 */
public class Card {
    /**
     * Масть карты.
     */
    private final Suit suit;
    /**
     * Значение карты.
     */
    private final Value value;

    /**
     * Конструктор.
     *
     * @param suit  Входящий аргумент - масть карты.
     * @param value Входящий аргумент - значение карты.
     */
    public Card(Suit suit, Value value) {
        this.suit = suit;
        this.value = value;
    }

    /**
     * Метод создает колоду игральных карт и выводит в консоль используя лямбду.
     *
     * @param args Входящий аргумент.
     */
    public static void main(String[] args) {
        Stream.of(Suit.values())
                .flatMap(suit -> Stream.of(Value.values())
                        .map(value -> new Card(suit, value)))
                .forEach(System.out::println);
    }

    /**
     * Переопределённый метод вывода строк в консоль.
     *
     * @return Возвращает строку.
     */
    @Override
    public String toString() {
        return "Card{"
                + "suit="
                + suit
                + ", value="
                + value + '}';
    }
}
