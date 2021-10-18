package ru.job4j.map;

import java.util.Map;
import java.util.Optional;
import java.util.Set;

/**
 * Класс описывает работу колледжа.
 *
 * @author Iuriy Gaydarzhi.
 * @since 16.10.2021
 */
public class College {
    /**
     * Множество студентов.
     */
    private final Map<Student, Set<Subject>> students;

    /**
     * Конструктор.
     *
     * @param students Множество студентов.
     */
    public College(Map<Student, Set<Subject>> students) {
        this.students = students;
    }

    /**
     * Метод ищет студента по аккаунту в множестве аккаунтов.
     *
     * @param account Аккаунт в колледже.
     * @return найденный аккаунт или Optional.empty.
     */
    public Optional<Student> findByAccount(String account) {
        Optional<Student> rsl = Optional.empty();
        for (Student s : students.keySet()) {
            if (account.equals(s.getAccount())) {
                rsl = Optional.of(s);
                break;
            }
        }
        return rsl;
    }

    /**
     * Метод ищет студента по имени в множестве аккаунтов.
     *
     * @param account Аккаунт.
     * @param name    Имя.
     * @return Имя студента или Optional.empty.
     */
    public Optional<Subject> findBySubjectName(String account, String name) {
        Optional<Subject> rsl = Optional.empty();
        Optional<Student> s = findByAccount(account);
        if (s.isPresent()) {
            Set<Subject> subjects = students.get(s.get());
            for (Subject subj : subjects) {
                if (name.equals(subj.getName())) {
                    rsl = Optional.of(subj);
                    break;
                }
            }
        }
        return rsl;
    }
}
