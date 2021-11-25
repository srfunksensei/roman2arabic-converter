package com.zuhlke;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CodingChallengeTest {

    final CodingChallenge underTest = new CodingChallenge();

    @Test
    public void simpleConversion() {
        assertEquals(underTest.converToArabic("I"), 1);
        assertEquals(underTest.converToArabic("V"), 5);
        assertEquals(underTest.converToArabic("X"), 10);
        assertEquals(underTest.converToArabic("L"), 50);
        assertEquals(underTest.converToArabic("C"), 100);
        assertEquals(underTest.converToArabic("D"), 500);
        assertEquals(underTest.converToArabic("M"), 1000);
    }

    @Test
    public void six() {
        assertEquals( 6, underTest.converToArabic("VI"));
    }

    @Test
    public void four() {
        assertEquals( 4, underTest.converToArabic("IV"));
    }
}