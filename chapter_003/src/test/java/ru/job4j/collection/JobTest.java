package ru.job4j.collection;


import java.util.Comparator;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

/**
 * 1. Для модели ru.job4j.collection.Job создайте 4 компаратора:
 * - по имени и по возрастанию
 * - по приоритету и по возрастанию
 * - по имени и по убыванию
 * - по приоритету и по убыванию
 * 2. Напишите тесты, проверяющие отдельно поведение компараторов.
 * 3. Напишите тесты, проверяющие поведение комбинированных компараторов.
 */
public class JobTest {

    /**
     * Тест компаратора сортировки по убыванию по полю name, затем по убыванию по полю priority.
     */
    @Test
    public void whenComparatorByNameAndPriority() {
        Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Fix bug", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl).isGreaterThan(0);
    }

    /**
     * Тест компаратора сортировки по возрастанию по полю name, затем по возрастанию по полю priority.
     */
    @Test
    public void whenComparatorAscByNameAndPriority() {
        Comparator<Job> cmpNamePriority = new JobAscByName().thenComparing(new JobAscByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Impl task", 1)
        );
        assertThat(rsl).isLessThan(0);
    }

    /**
     * Тест компаратора сортировки по убыванию по полю name, затем по возрастанию по полю priority,
     * затем по возрастанию по количеству символов в поле name.
     **/
    @Test
    public void whenComparatorDescByNameAscByPriorityAscByNameLn() {
        Comparator<Job> jobComparator = new JobDescByName().thenComparing(new JobAscByPriority().thenComparing(new JobAscByNameLn()));
        int rsl = jobComparator.compare(
                new Job("Fix bug", 4),
                new Job("Fix bug", 4));
        assertThat(rsl).isGreaterThan(0);
    }

    /**
     * Тест компаратора сортировки по возрастанию по полю priority, затем по убыванию по полю name.
     */
    @Test
    public void whenComparatorAscByPriorityDescByName() {
        Comparator<Job> jobComparator = new JobAscByPriority().thenComparing(new JobDescByName());
        int rsl = jobComparator.compare(
                new Job("Fix bugs", 4),
                new Job("Reboot server", 4));
        assertThat(rsl).isGreaterThan(0);
    }

    /**
     * Тест для компаратора сортировки по возрастанию по полю name.
     */
    @Test
    public void whenCompareAscAByName() {
        Comparator<Job> compareByName = new JobAscByName();
        int rsl = compareByName.compare(new Job("Petr", 32), new Job("Ivan", 31));
        assertThat(rsl).isGreaterThan(0);
    }

    /**
     * Тест для компаратора сортировки по убыванию по полю name.
     */
    @Test
    public void whenCompareDescByName() {
        Comparator<Job> compareDescByName = new JobDescByName();
        int rsl = compareDescByName.compare(new Job("Petr", 30), new Job("Ivan", 30));
        assertThat(rsl).isLessThan(0);
    }

    /**
     * Тест для компаратора сортировки по возрастанию по полю priority.
     */
    @Test
    public void whenCompareAscByPriority() {
        Comparator<Job> compareByPriority = new JobAscByPriority();
        int rsl = compareByPriority.compare(new Job("Ivan", 31), new Job("Ivan", 33));
        assertThat(rsl).isLessThan(0);
    }

    /**
     * Тест для компаратора сортировки по убыванию по полю priority.
     */
    @Test
    public void whenCompareDescByPriority() {
        Comparator<Job> compareByPriority = new JobDescByPriority();
        int rsl = compareByPriority.compare(new Job("Ivan", 31), new Job("Ivan", 33));
        assertThat(rsl).isGreaterThan(0);
    }
}
