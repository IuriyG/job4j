package ru.job4j.map;

import java.util.*;

/**
 * @author Iuriy Gaydarzhi.
 * @since 21.07.2022
 */
public class AnalyzeByMap {

    public static double averageScore(List<Pupil> pupils) {
        double rsl = 0;
        int count = 0;
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                rsl += subject.score();
                count++;
            }
        }
        return rsl / count;
    }

    public static List<Label> averageScoreByPupil(List<Pupil> pupils) {
        List<Label> ll = new ArrayList<>();
        double sum = 0;
        int count = 0;
        for (int i = 0; i < pupils.size(); i++) {
            for (Subject subject : pupils.get(i).subjects()) {
                sum += subject.score();
                count++;
            }
            ll.add(i, new Label(pupils.get(i).name(), sum / count));
            count = 0;
            sum = 0;
        }
        return ll;
    }

    public static List<Label> averageScoreBySubject(List<Pupil> pupils) {
        int count = 0, num = 0;
        List<Label> ll = new ArrayList<>();
        Map<String, Integer> map = new LinkedHashMap<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                map.computeIfPresent(subject.name(), (s, integer) -> (integer + subject.score()));
                map.putIfAbsent(subject.name(), subject.score());
                count++;
            }
            num = count;
            count = 0;
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            ll.add(count, new Label(entry.getKey(), ((double) entry.getValue()) / num));
            count++;
        }
        return ll;
    }

    public static Label bestStudent(List<Pupil> pupils) {
        List<Label> ll = new ArrayList<>();
        double sum = 0;
        for (int i = 0; i < pupils.size(); i++) {
            for (Subject subject : pupils.get(i).subjects()) {
                sum += subject.score();
            }
            ll.add(i, new Label(pupils.get(i).name(), sum));
            sum = 0;
        }
        ll.sort(Comparator.naturalOrder());
        return ll.get(0);
    }

    public static Label bestSubject(List<Pupil> pupils) {
        int count = 0;
        List<Label> ll = new ArrayList<>();
        Map<String, Integer> map = new LinkedHashMap<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                map.computeIfPresent(subject.name(), (s, integer) -> (integer + subject.score()));
                map.putIfAbsent(subject.name(), subject.score());
            }
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            ll.add(count, new Label(entry.getKey(), ((double) entry.getValue())));
            count++;
        }
        ll.sort(Comparator.naturalOrder());
        return ll.get(0);
    }
}