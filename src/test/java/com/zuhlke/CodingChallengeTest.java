package com.zuhlke;

import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CodingChallengeTest {

    final CodingChallenge underTest = new CodingChallenge();

    @Test
    public void simpleConversion() {
        assertEquals(underTest.converToArabic(CodingChallenge.ROMAN_ONE), 1);
        assertEquals(underTest.converToArabic(CodingChallenge.ROMAN_FIVE), 5);
        assertEquals(underTest.converToArabic(CodingChallenge.ROMAN_TEN), 10);
        assertEquals(underTest.converToArabic(CodingChallenge.ROMAN_FIFTY), 50);
        assertEquals(underTest.converToArabic(CodingChallenge.ROMAN_ONE_HUNDRED), 100);
        assertEquals(underTest.converToArabic(CodingChallenge.ROMAN_FIVE_HUNDRED), 500);
        assertEquals(underTest.converToArabic(CodingChallenge.ROMAN_ONE_THOUSAND), 1000);
    }

    @Ignore
    public void six() {
        assertEquals( 6, underTest.converToArabic("VI"));
    }

    @Test
    public void four() {
        assertEquals( 4, underTest.converToArabic("IV"));
    }
}