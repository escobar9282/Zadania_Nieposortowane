package com.zadania_nieposortowane.Zadanie_020;

import java.util.Scanner;

public class Game {
    private Scanner scanner = new Scanner(System.in);
    private int money = 10_000;
    private int mobilesNumber = 100;

    public int getMoney() {
        return money;
    }

    public int getMobilesNumber() {
        return mobilesNumber;
    }

    public void sellMobile() {
        int mobilesNumberForSell = scanner.nextInt();

        if (mobilesNumberForSell <= mobilesNumber) {

        }
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void setMobilesNumber(int mobilesNumber) {
        this.mobilesNumber = mobilesNumber;
    }
}
