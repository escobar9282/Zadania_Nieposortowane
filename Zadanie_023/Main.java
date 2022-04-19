package com.zadania_nieposortowane.Zadanie_023;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = "Polska";
        String checkPassword;
        boolean goodPassword = false;

        while (goodPassword == false) {
            System.out.println("Podaj haslo");
            System.out.print("Haslo: ");
            checkPassword = scanner.nextLine();
            if (!checkPassword.equals(password)) {
                System.out.println("Zle haslo. Sprobuj jeszcze raz.");
            } else if (checkPassword.equals(password)) {
                System.out.println("Brawo, zgadles. Haslo to " + checkPassword);
                goodPassword = true;
            }
        }
    }
}