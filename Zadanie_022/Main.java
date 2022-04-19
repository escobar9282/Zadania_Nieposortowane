package com.zadania_nieposortowane.Zadanie_022;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);



        int randomNumber = random.nextInt(5)+1;
        System.out.println("Program wylosowal liczbe od 1 do 600.");

        while (true) {
            System.out.println("Zgadnij jaka to liczba i wpisz ja ponizej");
            int checkNumber = scanner.nextInt();
            if (checkNumber > randomNumber) {
                System.out.println("Musisz celowac troche nizej.\nSprobuj jeszcze raz");
            } else if (checkNumber < randomNumber) {
                System.out.println("Musisz celowac troche wyzej.\nSprobuj jeszcze raz");
            } else {
                break;
            }
        }
    }

}
