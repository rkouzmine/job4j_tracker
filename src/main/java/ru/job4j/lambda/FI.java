package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class FI {
    public static void main(String[] args) {
        Attachment[] attachments = {
                new Attachment("image 1", 20),
                new Attachment("image 3", 120),
                new Attachment("image 2", 23)
        };
        Comparator<Attachment> comparator = new Comparator<Attachment>() {
            @Override
            public int compare(Attachment o1, Attachment o2) {
                return Integer.compare(o1.getSize(), o2.getSize());
            }
        };
        Arrays.sort(attachments, comparator);

        Comparator<String> comparatorSize = (left, right) ->
                Integer.compare(left.length(), right.length());

        Comparator<String> comparatorText = (left, right) -> left.compareTo(right);

        Comparator<String> comparatorDescSize = (left, right) ->
                Integer.compare(right.length(), left.length());
    }
}
