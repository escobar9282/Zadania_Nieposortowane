package com.zadania_nieposortowane.Podwojna_wiezycka;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("hello! How many stars do you want");
        Scanner s = new Scanner(System.in);
        int numOfStars = s.nextInt();
	for (int i  = 1; i <= numOfStars; i++) {
        for (int j = 0; j<i ; j++){
            System.out.print("*");
        }
        System.out.println();
    }
    for (int i = numOfStars ; i > 0; i--) {
        for (int j = 0; j < i; j++){
            System.out.print("*");

        }
        System.out.println();
    }
    }
}
