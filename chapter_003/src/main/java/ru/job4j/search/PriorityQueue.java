package ru.job4j.search;

import java.util.LinkedList;

/**
 * Класс описывает работу простейшей очереди по приоритету,
 * которая работает по принципу FIFO (first in - first out).
 *
 * @author Iuriy Gaydarzhi.
 * @version 1.0
 */

public class PriorityQueue {
    private final LinkedList<Task> tasks = new LinkedList<>();

    /**
     * Метод принимает заявку и добавляет ее в очередь.
     * Если встречаются две заявки с одинаковым полем приоритет,
     * то в очереди они распределяются по принципу FIFO.
     *
     * @param task задача, которая добавляется в очередь.
     */
    public void put(Task task) {
        var index = 0;
        for (var element : tasks) {
            if (task.getPriority() < element.getPriority()) {
                break;
            }
            index++;
        }
        this.tasks.add(index, task);
    }

    /**
     * Метод возвращает первую задачу в очереди.
     *
     * @return Возвращает первую задачу в очереди или null если очередь пуста.
     */
    public Task take() {
        return tasks.poll();
    }
}
