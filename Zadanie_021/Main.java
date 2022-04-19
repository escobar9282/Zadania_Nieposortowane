package com.zadania_nieposortowane.Zadanie_021;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int number = random.nextInt();
        int answer;
        boolean goodAnswer = false;

        System.out.println("Program wylosowal liczbe, zgadnij jaka to liczba");
        while (goodAnswer == false) {
            System.out.print("Odpowiedz: ");
            answer = scanner.nextInt();
            if (answer < number) {
                System.out.println("Celujesz za nisko");
            } else if (answer > number) {
                System.out.println("Celujesz za wysoko");
            } else if (answer == number) {
                System.out.println("Brawo, zgadles. Wylosowana liczba to " + number);
                goodAnswer = true;
            }
        }
    }
}
