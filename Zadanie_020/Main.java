package com.zadania_nieposortowane.Zadanie_020;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static String login;
    static String password;
    static String againPassword;
    static Game game = new Game();
    static int choice;

    public static void main(String[] args) {

        signUp();
        signIn();
        nextGame();

    }

    static void signUp() {

        System.out.println("!!! Zarejestruj sie !!!");
        System.out.print("Podaj Login: ");
        login = scanner.nextLine();
        System.out.print("Podaj haslo: ");
        password = scanner.nextLine();
        System.out.print("Powtorz haslo: ");
        againPassword = scanner.nextLine();

        if (!password.equals(againPassword)) {
            System.out.println("Pierwsze i drugie wpisywane haslo musza byc takie same !!!");
            System.out.println("Sprobuj jeszcze raz");
            signUp();
        }

        if (password.length() < 8) {
            System.out.println("Podane haslo jest za slabe. Sprobuj jeszcze raz");
            signUp();
        }

        System.out.println("Brawo, ostales zarejestrowany !\n");

    }

    static void signIn() {

        System.out.println("Czas sie zalogowac");
        System.out.print("Lgoin: ");
        String login2 = scanner.nextLine();
        System.out.print("Password: ");
        String password2 = scanner.nextLine();

        if (!login2.equals(login) || !password2.equals(password)) {
            System.out.println("UWAGA\nPodany login i haslo sa nieprawidlowe, sprobuj jeszcze raz.");
            signIn();
        }

        System.out.println("\nUdalo ci sie zalogowac do systemu twojego sklepu !!!");

    }

    static void nextGame() {
        int lBMs;

        // Menu
        System.out.println("Informacje o twoim sklepie");
        System.out.println("Monety: " + game.getMoney() + ", Telefony: " + game.getMobilesNumber());
        System.out.println("Wybierz, co chcesz teraz robic");
        System.out.println("1-Zamow telefon; 2-Sprzedaj telefon; 3- Wyloguj sie");
        System.out.print("Wybor: ");
        choice = scanner.nextInt();

        if (choice == 1) {

            System.out.println("Ile telefonow chcesz zamowic do swojego sklepu? 1 tel. kosztuje 100pln");
            lBMs = scanner.nextInt();
            if (lBMs * 100 <= game.getMoney()) {

                game.setMoney(game.getMoney() - (lBMs * 100));
                game.setMobilesNumber(game.getMobilesNumber() + lBMs);
                System.out.println("Kupiles " + lBMs + " telefonow. Co chcesz robic teraz?");
                nextGame();

            } else {

                System.out.println("Masz za malo pieniedzy, sprobuj jeszcze raz");
                nextGame();

            }


        } else if (choice == 2) {

            System.out.println("Ile tel chcesz sprzedac? 1 tel, sprzedasz za 120pln");
            lBMs = scanner.nextInt();

            if (lBMs <= game.getMobilesNumber()) {
                game.setMobilesNumber(game.getMobilesNumber()-lBMs);
                game.setMoney(game.getMoney()+(lBMs*150));
                System.out.println("Sprzedales " + lBMs + "telefonow. Co chcesz robic teraz?");
                nextGame();
            } else {
                System.out.println("Masz za malo telefonow zeby sprzedac ich az tyle.\nKup wiecej telefonow, badz jezeli nie asz tyle pieniedzy- sprzedaj mniej z nich.");
            }


        } else if (choice == 3) {
            System.out.println("___________________________________________________________________");
            System.out.println("Jezeli sie wylogujesz, nastapi wyjscie z systemu systemu sklepu");
            System.out.println("Czy jestes pewien swojego wyboru? (1-nie 2-tak)");
            System.out.print("Wybor: ");
            int choice2 = scanner.nextInt();
            if (choice2 == 1) {
                System.out.println("Super, ze zmieniles zdanie i zostales :)");
                nextGame();
            } else if (choice2 == 2){
                System.out.println("Zegnaj :(\nZaraz nastapi zakonczenie dzialania systemu");
            } else {
                System.out.println("Nie ma takiego wyboru !!!");
                nextGame();
            }
        } else {
            System.out.println("Zly wybor, sprobuj jeszcze raz");
            nextGame();
        }

    }

}