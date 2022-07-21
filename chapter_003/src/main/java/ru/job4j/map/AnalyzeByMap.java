package ru.job4j.map;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Iuriy Gaydarzhi.
 * @since 21.07.2022
 */
public class AnalyzeByMap {

    public static double averageScore(List<Pupil> pupils) {
        return pupils.stream()
                .flatMap(pupil -> pupil.subjects().stream())
                .collect(Collectors.averagingDouble(Subject::score));
    }

    public static List<Label> averageScoreByPupil(List<Pupil> pupils) {
        return pupils.stream()
                .map(pupil -> new Label(pupil.name(), pupil.subjects().stream()
                        .collect(Collectors.averagingDouble(Subject::score)))).toList();
    }

    public static List<Label> averageScoreBySubject(List<Pupil> pupils) {
        return pupils.stream()
                .flatMap(pupil -> pupil.subjects().stream())
                .collect(Collectors.groupingBy(Subject::name, LinkedHashMap::new, Collectors
                        .averagingDouble(Subject::score))).entrySet().stream()
                .map(sDE -> new Label(sDE.getKey(), sDE.getValue())).toList();
    }

    public static Label bestStudent(List<Pupil> pupils) {
        return pupils.stream()
                .map(pupil -> new Label(pupil.name(), pupil.subjects().stream()
                        .mapToDouble(Subject::score).sum()))
                .max(Comparator.naturalOrder()).stream()
                .reduce((first, second) -> second).orElse(null);
    }

    public static Label bestSubject(List<Pupil> pupils) {
        return pupils.stream().flatMap(pupil -> pupil.subjects().stream())
                .collect(Collectors.groupingBy(Subject::name, LinkedHashMap::new,
                        Collectors.summingDouble(Subject::score))).entrySet().stream()
                .map(sDE -> new Label(sDE.getKey(), sDE.getValue()))
                .max(Comparator.naturalOrder()).stream()
                .reduce((first, second) -> second).orElse(null);
    }
}