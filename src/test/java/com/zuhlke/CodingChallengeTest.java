package com.zuhlke;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CodingChallengeTest {

    @Test
    public void simpleConversion() {
        assertEquals(Roman.I.toInt(), CodingChallenge.convertToArabic("I"));
        assertEquals(Roman.V.toInt(), CodingChallenge.convertToArabic("V"));
        assertEquals(Roman.X.toInt(), CodingChallenge.convertToArabic("X"));
        assertEquals(Roman.L.toInt(), CodingChallenge.convertToArabic("L"));
        assertEquals(Roman.C.toInt(), CodingChallenge.convertToArabic("C"));
        assertEquals(Roman.D.toInt(), CodingChallenge.convertToArabic("D"));
        assertEquals(Roman.M.toInt(), CodingChallenge.convertToArabic("M"));
    }

    @Test
    public void prefixCombination() {
        assertEquals( 4, CodingChallenge.convertToArabic("IV"));
        assertEquals( 9, CodingChallenge.convertToArabic("IX"));
        assertEquals( 40, CodingChallenge.convertToArabic("XL"));
        assertEquals( 90, CodingChallenge.convertToArabic("XC"));
        assertEquals( 400, CodingChallenge.convertToArabic("CD"));
        assertEquals( 900, CodingChallenge.convertToArabic("CM"));
    }

    @Test
    public void suffixCombination() {
        assertEquals( 6, CodingChallenge.convertToArabic("VI"));
        assertEquals( 20, CodingChallenge.convertToArabic("XX"));
        assertEquals( 30, CodingChallenge.convertToArabic("XXX"));
        assertEquals( 70, CodingChallenge.convertToArabic("LXX"));
        assertEquals( 600, CodingChallenge.convertToArabic("DC"));
        assertEquals( 1200, CodingChallenge.convertToArabic("MCC"));
    }
    
    @Test
    public void complexConversion() {
        assertEquals( 38, CodingChallenge.convertToArabic("XXXVIII"));
        assertEquals( 42, CodingChallenge.convertToArabic("XLII"));
        assertEquals(63, CodingChallenge.convertToArabic("LXIII"));
        assertEquals( 95, CodingChallenge.convertToArabic("XCV"));
        assertEquals( 99, CodingChallenge.convertToArabic("XCIX"));
        assertEquals( 256, CodingChallenge.convertToArabic("CCLVI"));
        assertEquals( 487, CodingChallenge.convertToArabic("CDLXXXVII"));
        assertEquals( 974, CodingChallenge.convertToArabic("CMLXXIV"));
        assertEquals( 1949, CodingChallenge.convertToArabic("MCMXLIX"));
    }

    @Test
    public void containsOnlyRomanLiterals_ok() {
        assertTrue(CodingChallenge.containsOnlyRomanLiterals("XXXVIII"));
        assertTrue(CodingChallenge.containsOnlyRomanLiterals("XLII"));
        assertTrue(CodingChallenge.containsOnlyRomanLiterals("LXIII"));
        assertTrue(CodingChallenge.containsOnlyRomanLiterals("XCV"));
        assertTrue(CodingChallenge.containsOnlyRomanLiterals("XCIX"));
        assertTrue(CodingChallenge.containsOnlyRomanLiterals("CCLVI"));
        assertTrue(CodingChallenge.containsOnlyRomanLiterals("CDLXXXVII"));
        assertTrue(CodingChallenge.containsOnlyRomanLiterals("CMLXXIV"));
        assertTrue(CodingChallenge.containsOnlyRomanLiterals("MCMXLIX"));
    }

    @Test
    public void containsOnlyRomanLiterals_notOk() {
        assertFalse(CodingChallenge.containsOnlyRomanLiterals("XXX9012345678"));
        assertFalse(CodingChallenge.containsOnlyRomanLiterals("XLQA"));
        assertFalse(CodingChallenge.containsOnlyRomanLiterals("X!@#$%ˆˆ*()_+"));
        assertFalse(CodingChallenge.containsOnlyRomanLiterals("XC,./;''[]IX"));
        assertFalse(CodingChallenge.containsOnlyRomanLiterals("<>?:\"{}~§CCLVI"));
    }
}