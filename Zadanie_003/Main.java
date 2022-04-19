package com.zadania_nieposortowane.Zadanie_003;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter sentence");
        String sentence = scanner.nextLine();
        if (sentence.contains("pies")) {
            System.out.println("Sentence contains word 'pies'");
            }
        else {
            System.out.println("Sentence doesn't conain word 'pies'");
        }
    }}
