package ru.job4j.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Вывод сортировки.
 */

public class JobSorter {

    public static void main(String[] args) {
        List<Job> jobs = Arrays.asList(
                new Job("Fix bugs", 4),
                new Job("Impl task", 2),
                new Job("Reboot server", 1),
                new Job("X task", 0)
        );
        System.out.println("Список до сортировки:" + System.lineSeparator() + jobs);
        System.out.println();
        Collections.sort(jobs);

        //Сортировка по возрастанию по полю priority
        System.out.println("Сортировка по возрастанию по полю priority:" + System.lineSeparator() + jobs);
        System.out.println();

        //Сортировка по возрастанию по полю name через компаратор
        Collections.sort(jobs, new SortByNameJob());
        System.out.println("Сортировка по возрастанию по полю name через компаратор:" + System.lineSeparator() + jobs);
        System.out.println();

        //Сортировка в возрастающем порядке по полю name с использованием метода thenComparing(в убывающем по рядке по полю priority).
        Collections.sort(jobs, new SortByNameJob().thenComparing(new JobDescByPriority()));
        System.out.println("Сортировка в возрастающем порядке по полю name с использованием метода thenComparing(в убывающем по рядке по полю priority):" + System.lineSeparator() + jobs);
        System.out.println();

        //Сортировка в возрастающем порядке по полю name,затем в обратном порядке по полю priority, затем в обратном порядке по количеству символов в name
        Collections.sort(jobs, new SortByNameJob().thenComparing(new JobDescByPriority()).thenComparing(new JobDescByNameLn()));
        System.out.println("Сортировка в возрастающем порядке по полю name,затем в убывающем порядке по полю priority, затем в обратном порядке по количеству символов в name:" + System.lineSeparator() + jobs);
        System.out.println();

    }
}
