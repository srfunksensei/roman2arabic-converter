package com.zuhlke;

import java.util.HashMap;
import java.util.Map;

public class CodingChallenge {

    public static final String ROMAN_ONE = "I";
    public static final String ROMAN_FIVE = "V";
    public static final String ROMAN_TEN = "X";
    public static final String ROMAN_FIFTY = "L";
    public static final String ROMAN_ONE_HUNDRED = "C";
    public static final String ROMAN_FIVE_HUNDRED = "D";
    public static final String ROMAN_ONE_THOUSAND = "M";

    public static final Map<String, Integer> ROMAN_TO_ARABIC_MAP = new HashMap<String, Integer>() {{
        put(ROMAN_ONE, 1);
        put(ROMAN_FIVE, 5);
        put(ROMAN_TEN, 10);
        put(ROMAN_FIFTY, 50);
        put(ROMAN_ONE_HUNDRED, 100);
        put(ROMAN_FIVE_HUNDRED, 500);
        put(ROMAN_ONE_THOUSAND, 1000);
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
        String previousChar = null;

        for (int i = 0; i < roman.length(); i++) {
            final String currentChar = String.valueOf(roman.charAt(i));
            if (ROMAN_TO_ARABIC_MAP.containsKey(currentChar)) {

                final int value = getValue(previousChar, currentChar);
                if (value != 0) {
                    number += value - ROMAN_TO_ARABIC_MAP.get(previousChar);
                } else {
                    number += ROMAN_TO_ARABIC_MAP.get(currentChar);
                }
                previousChar = currentChar;
            }
        }

        return number;
    }

    private int getValue(final String previousChar, final String currentChar) {
        if (ROMAN_ONE.equals(previousChar) && ROMAN_FIVE.equals(currentChar) ||
                ROMAN_ONE.equals(previousChar) && ROMAN_TEN.equals(currentChar) ||
                ROMAN_TEN.equals(previousChar) && ROMAN_FIFTY.equals(currentChar) ||
                ROMAN_TEN.equals(previousChar) && ROMAN_ONE_HUNDRED.equals(currentChar) ||
                ROMAN_ONE_HUNDRED.equals(previousChar) && ROMAN_FIVE_HUNDRED.equals(currentChar) ||
                ROMAN_ONE_HUNDRED.equals(previousChar) && ROMAN_ONE_THOUSAND.equals(currentChar)) {
            return ROMAN_TO_ARABIC_MAP.get(currentChar) - ROMAN_TO_ARABIC_MAP.get(previousChar);
        }

        return 0;
    }
}