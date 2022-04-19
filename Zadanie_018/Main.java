package com.zadania_nieposortowane.Zadanie_018;

public class Main {

    public static void main(String[] args) {
        int[] t1 = {1, 2};
        int[] t2 = {4, 8};
        System.out.println("t1: " + method(t1) + "\nt2: " + method(t2));
    }

    static int method(int[] t) {

        int sum = t[0]+t[1];
        return sum;
    }
}
