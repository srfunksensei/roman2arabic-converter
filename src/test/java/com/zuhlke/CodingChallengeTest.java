package com.zuhlke;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CodingChallengeTest {

    final CodingChallenge underTest = new CodingChallenge();

    @Test
    public void simpleConversion() {
        assertEquals(Roman.I.toInt(), underTest.convertToArabic("I"));
        assertEquals(Roman.V.toInt(), underTest.convertToArabic("V"));
        assertEquals(Roman.X.toInt(), underTest.convertToArabic("X"));
        assertEquals(Roman.L.toInt(), underTest.convertToArabic("L"));
        assertEquals(Roman.C.toInt(), underTest.convertToArabic("C"));
        assertEquals(Roman.D.toInt(), underTest.convertToArabic("D"));
        assertEquals(Roman.M.toInt(), underTest.convertToArabic("M"));
    }

    @Test
    public void prefixCombination() {
        assertEquals( 4, underTest.convertToArabic("IV"));
        assertEquals( 9, underTest.convertToArabic("IX"));
        assertEquals( 40, underTest.convertToArabic("XL"));
        assertEquals( 90, underTest.convertToArabic("XC"));
        assertEquals( 400, underTest.convertToArabic("CD"));
        assertEquals( 900, underTest.convertToArabic("CM"));
    }

    @Test
    public void sufixCombination() {
        assertEquals( 6, underTest.convertToArabic("VI"));
        assertEquals( 20, underTest.convertToArabic("XX"));
        assertEquals( 30, underTest.convertToArabic("XXX"));
        assertEquals( 70, underTest.convertToArabic("LXX"));
        assertEquals( 600, underTest.convertToArabic("DC"));
        assertEquals( 1200, underTest.convertToArabic("MCC"));
    }

// 1949 = MCMXLIX
//        XCV XC + V or 90 + 5 = 95
//        XCIX XC + IX or 90 + 9 = 99
}