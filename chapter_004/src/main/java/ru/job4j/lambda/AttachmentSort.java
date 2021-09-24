package ru.job4j.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Класс демонстрирует работу анонимного класса.
 *
 * @author Iuriy Gaydarzhi.
 * @since 24.09.2021
 */
public class AttachmentSort {
    /**
     * Основной класс.
     * В котором создан Список и добавлены несколько объектов типа Attachment.
     *
     * @param args Входящие аргументы.
     */
    public static void main(String[] args) {
        List<Attachment> attachments = Arrays.asList(
                new Attachment("image 1", 100),
                new Attachment("image 3", 34),
                new Attachment("image 2", 13)
        );

        Comparator comparator = new Comparator() {

            /**
             * Переопределенный метод сравнения по возрастанию 2-х объектов по полю Size.
             * @param o1 Первый объект.
             * @param o2 Второй объект.
             * @return Результат сравнения.
             */
            @Override
            public int compare(Object o1, Object o2) {
                Attachment left = (Attachment) o1;
                Attachment right = (Attachment) o2;
                return left.getSize() - right.getSize();
            }
        };

        attachments.sort(comparator);
        System.out.println(attachments);

        Comparator comparatorReverse = new Comparator() {

            /**
             * Переопределенный метод сравнения по убыванию 2-х объектов по полю Size.
             * @param o1 Первый объект.
             * @param o2 Второй объект.
             * @return Результат сравнения.
             */
            @Override
            public int compare(Object o1, Object o2) {
                Attachment left = (Attachment) o1;
                Attachment right = (Attachment) o2;
                return right.getSize() - left.getSize();
            }
        };

        attachments.sort(comparatorReverse);
        System.out.println(attachments);

        Comparator comparatorByName = new Comparator() {

            /**
             * Переопределенный метод сравнения по возрастанию 2-х объектов по полю Name.
             * @param o1 Первый объект.
             * @param o2 Второй объект.
             * @return Результат сравнения.
             */
            @Override
            public int compare(Object o1, Object o2) {
                Attachment left = (Attachment) o1;
                Attachment right = (Attachment) o2;
                return left.getName().compareTo(right.getName());
            }
        };

        attachments.sort(comparatorByName);
        System.out.println(attachments);
    }
}
