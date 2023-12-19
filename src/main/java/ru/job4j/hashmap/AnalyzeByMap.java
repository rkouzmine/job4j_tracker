package ru.job4j.hashmap;

import java.util.*;

public class AnalyzeByMap {
    public static double averageScore(List<Pupil> pupils) {
        int count = 0;
        int points = 0;
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                count++;
                points += subject.score();
            }
        }
        return (double) points / count;
    }

    public static List<Label> averageScoreByPupil(List<Pupil> pupils) {
        List<Label> result = new ArrayList<>();
        for (Pupil pupil : pupils) {
            int count = 0;
            int points = 0;
            for (Subject subject : pupil.subjects()) {
                count++;
                points += subject.score();
            }
            result.add(new Label(pupil.name(), (double) points / count));
        }
        return result;
    }

    public static List<Label> averageScoreBySubject(List<Pupil> pupils) {
        Map<String, Integer> map = new LinkedHashMap<>();
        List<Label> subjects = new ArrayList<>();
        int count = 0;
        for (Pupil pupil : pupils) {
            count++;
            for (Subject subject : pupil.subjects()) {
                int points = map.getOrDefault(subject.name(), 0);
                map.put(subject.name(), points + subject.score());
            }
        }
        for (String key : map.keySet()) {
            subjects.add(new Label(key, ((double) map.get(key)) / count));
        }
        return subjects;
    }

    public static Label bestStudent(List<Pupil> pupils) {
        Map<String, Integer> map = new LinkedHashMap<>();
        List<Label> labels = new ArrayList<>();
        int points = 0;
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                points += subject.score();
            }
            map.put(pupil.name(), points);
            points = 0;
        }
        for (String key : map.keySet()) {
            labels.add(new Label(key, map.get(key)));
        }
        labels.sort(Comparator.naturalOrder());
        return labels.get(labels.size() - 1);
    }

    public static Label bestSubject(List<Pupil> pupils) {
        Map<String, Integer> map = new LinkedHashMap<>();
        List<Label> labels = new ArrayList<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                int points = map.getOrDefault(subject.name(), 0);
                map.put(subject.name(), points + subject.score());
            }
        }
        for (String key : map.keySet()) {
            labels.add(new Label(key, map.get(key)));
        }
        labels.sort(Comparator.naturalOrder());
        return labels.get(labels.size() - 1);
    }
}