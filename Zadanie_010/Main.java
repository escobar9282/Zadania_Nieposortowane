package com.zadania_nieposortowane.Zadanie_010;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner o = new Scanner(System.in);
        System.out.println("Podaj wysokosc choinki");
        int height = o.nextInt();


        for (int i = 1; i<=height; i++)
        {
            for(int j=0;j<height-i;j++)System.out.print(" ");
            for (int j = 0; j<(i*2)-1; j++)System.out.print("*");
            System.out.println(" ");
        }
    }
}
