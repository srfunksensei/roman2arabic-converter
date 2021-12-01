package com.zuhlke;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CodingChallenge {

    public static boolean containsOnlyRomanLiterals(final String input) {
        final List<String> charactersUsed
                = input.chars()
                .distinct()
                .mapToObj(c -> (char) c)
                .map(c -> Character.toString(c))
                .collect(Collectors.toList());

        final List<String> romanChars = Arrays.stream(Roman.values())
                .map(Enum::toString)
                .collect(Collectors.toList());

        return romanChars.containsAll(charactersUsed);
    }

    public static int convertToArabic(final String input) {
        final List<Roman> romans = input.chars()
                .mapToObj(c -> (char) c)
                .map(c -> Character.toString(c))
                .map(Roman::valueOf)
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