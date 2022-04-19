package com.zadania_nieposortowane.Zadanie_009;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        System.out.println(password);
                if (password.contentEquals("Polska")) {
            System.out.println("Poprawne hasło");
        }
                else{
                    System.out.println("Niepoprawne hasło");
                }

    }
}
