package com.zuhlke;

import java.util.HashMap;
import java.util.Map;

public class CodingChallenge {

    private static final Map<String, Integer> ROMAN_TO_ARABIC_MAP = new HashMap() {{
        put("I", 1);
        put("V", 5);
        put("X", 10);
        put("L", 50);
        put("C", 100);
        put("D", 500);
        put("M", 1000);

    }};

    public int converToArabic(final String roman) {
        // 1949 = MCMXLIX

//        VI 6 (5 + 1 = 6)
//        LXX 70 (50 + 10 + 10 = 70)
//        MCC 1200 (1000 + 100 + 100 = 1200)
//        IV 4 (5 – 1 = 4)
//        XC 90 ( 100 – 10 = 90)
//        CM 900 (1000 – 100 = 900)
//        XCV XC + V or 90 + 5 = 95
//        XCIX XC + IX or 90 + 9 = 99
//        XX 20
//        XXX 30

        int number = 0;
        Character previousChar = null;
        final char[] possibleRomanNumbers = roman.trim().toCharArray();
        for (char possibleRomanNumber : possibleRomanNumbers) {
            String stringKey = "" + possibleRomanNumber;
            if (ROMAN_TO_ARABIC_MAP.containsKey(stringKey)) {
                final Integer possibleValue = ROMAN_TO_ARABIC_MAP.get(stringKey);
                if (previousChar != null) {
                    if (previousChar.toString().equals("I") && stringKey.equals("V")) {
                        number += 3;
                    }
                } else {
                    number += possibleValue;
                    previousChar = Character.valueOf(stringKey.charAt(0));
                }
            }
        }

        return number;
    }
}