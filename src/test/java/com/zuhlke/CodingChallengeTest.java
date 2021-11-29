package com.zuhlke;

import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CodingChallengeTest {

    final CodingChallenge underTest = new CodingChallenge();

    @Test
    public void simpleConversion() {
        assertEquals(CodingChallenge.ROMAN_TO_ARABIC_MAP.get(CodingChallenge.ROMAN_ONE), underTest.converToArabic(CodingChallenge.ROMAN_ONE));
        assertEquals(CodingChallenge.ROMAN_TO_ARABIC_MAP.get(CodingChallenge.ROMAN_FIVE), underTest.converToArabic(CodingChallenge.ROMAN_FIVE));
        assertEquals(CodingChallenge.ROMAN_TO_ARABIC_MAP.get(CodingChallenge.ROMAN_TEN), underTest.converToArabic(CodingChallenge.ROMAN_TEN));
        assertEquals(CodingChallenge.ROMAN_TO_ARABIC_MAP.get(CodingChallenge.ROMAN_FIFTY), underTest.converToArabic(CodingChallenge.ROMAN_FIFTY));
        assertEquals(CodingChallenge.ROMAN_TO_ARABIC_MAP.get(CodingChallenge.ROMAN_ONE_HUNDRED), underTest.converToArabic(CodingChallenge.ROMAN_ONE_HUNDRED));
        assertEquals(CodingChallenge.ROMAN_TO_ARABIC_MAP.get(CodingChallenge.ROMAN_FIVE_HUNDRED), underTest.converToArabic(CodingChallenge.ROMAN_FIVE_HUNDRED));
        assertEquals(CodingChallenge.ROMAN_TO_ARABIC_MAP.get(CodingChallenge.ROMAN_ONE_THOUSAND), underTest.converToArabic(CodingChallenge.ROMAN_ONE_THOUSAND));
    }

    @Ignore
    public void six() {
        assertEquals( 6, underTest.converToArabic("VI"));
    }

    @Test
    public void prefixCombination() {
        assertEquals( 4, underTest.converToArabic("IV"));
        assertEquals( 9, underTest.converToArabic("IX"));
        assertEquals( 40, underTest.converToArabic("XL"));
        assertEquals( 90, underTest.converToArabic("XC"));
        assertEquals( 400, underTest.converToArabic("CD"));
        assertEquals( 900, underTest.converToArabic("CM"));
    }
}