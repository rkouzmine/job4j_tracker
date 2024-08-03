package ru.job4j.exercises.map;

import java.util.*;

public class Weather {
    public static List<Info> editData(List<Info> list) {
        Map<String, Integer> map = new LinkedHashMap<>();
        for (Info info : list) {
            map.put(info.getCity(), map.getOrDefault(info.getCity(), 0) + info.getRainfall());
        }
        List<Info> rsl = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            rsl.add(new Info(entry.getKey(), entry.getValue()));
        }
        return rsl;
    }

    public static class Info {
        private final String city;

        private final int rainfall;

        public Info(String city, int rainfall) {
            this.city = city;
            this.rainfall = rainfall;
        }

        public String getCity() {
            return city;
        }

        public int getRainfall() {
            return rainfall;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Info info = (Info) o;
            return rainfall == info.rainfall
                    && Objects.equals(city, info.city);
        }

        @Override
        public int hashCode() {
            return Objects.hash(city, rainfall);
        }

        @Override
        public String toString() {
            return "Info{"
                    + "city='" + city + '\''
                    + ", rainfall=" + rainfall
                    + '}';
        }
    }

    public static void main(String[] args) {
        List<Info> list = List.of(
                new Info("Minsk", 25), new Info("Brest", 5), new Info("Grodna", 33),
                new Info("Gomel", 26), new Info("Minsk", 15), new Info("Vitebsk", 18),
                new Info("Grodna", 18), new Info("Brest", 18), new Info("Gomel", 40),
                new Info("Minsk", 55), new Info("Vitebsk", 36), new Info("Minsk", 30),
                new Info("Gomel", 15), new Info("Grodna", 15), new Info("Brest", 40));
        System.out.println(editData(list));
    }
}