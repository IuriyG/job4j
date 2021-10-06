package ru.job4j.lambda;

import java.util.List;

/**
 * Класс, пример в котором производится отладка лямбд.
 *
 * @author Iuriy Gaydarzhi.
 * @since 06.10.2021
 */
public class StreamUsage {

    /**
     * Метод демонстрирует работу лямбд.
     *
     * @param args Входящее аргумент.
     */
    public static void main(String[] args) {
        List<Task> tasks = List.of(
                new Task("Bug #1", 10),
                new Task("Task #2", 20),
                new Task("Bug #3", 40)
        );
        tasks.stream()
                .filter(task -> task.name.contains("Bug"))
                .filter(task -> task.spent > 30)
                .map(task -> task.name + " " + task.spent).forEach(System.out::println);
    }

    /**
     * Модель данных.
     */
    public static class Task {
        private final String name;
        private final long spent;

        /**
         * Конструктор.
         *
         * @param name  Входящее аргумент.
         * @param spent Входящее аргумент.
         */
        public Task(String name, long spent) {
            this.name = name;
            this.spent = spent;
        }
    }
}
