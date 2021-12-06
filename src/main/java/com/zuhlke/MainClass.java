package com.zuhlke;

import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {
        final Scanner obj = new Scanner(System.in);
        System.out.println("Enter a roman numeral:");
        final String roman = obj.nextLine();
        System.out.println(CodingChallenge.convertToArabic(roman));
    }
}
