package com.zuhlke;

import java.util.List;
import java.util.stream.Collectors;

public class CodingChallenge {

    public static int convertToArabic(final String input) {
        final List<Roman> romans = input.chars()
                .mapToObj(c -> (char) c)
                .map(c -> Character.toString(c))
                .map(c -> Roman.valueOf(c))
                .collect(Collectors.toList());

        int value = 0;
        while (!romans.isEmpty()) {
            final Roman current = romans.remove(0);
            if (!romans.isEmpty() && current.shouldCombine(romans.get(0))) {
                value += current.toInt(romans.remove(0));
            } else{
                value += current.toInt();
            }
        }
        return value;
    }
}