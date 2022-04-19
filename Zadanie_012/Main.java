package com.zadania_nieposortowane.Zadanie_012;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Podaj slowo: ");
        String slowo = getString();
        slowo.toLowerCase();
        System.out.println("czy to slowo jest palindronem? " + czyPalindrom(slowo));

    }

    public static String getString() {
        return new Scanner(System.in).next();
    }

    public static boolean czyPalindrom(String slowo) {

        int x = slowo.length();
        int counter=0;

        for (int i = 0; i < slowo.length()/2; i++) {
            if (slowo.charAt(i) == slowo.charAt(x-i-1)) {
                counter ++;
            }
        }
        return (counter==x/2);
    }
}


